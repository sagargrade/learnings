# How To

| Tool/Language  | Topic Name                      | Topic Reference                                       |
| -------------- | ------------------------------- | ----------------------------------------------------- |
| Chrome Console | Copy Object from Chrome Console | [Reference](#topic---copy-object-from-chrome-console) |

## Topic - Copy Object from Chrome Console

1. Right-click an object in Chrome's console and select `Store as Global Variable` from the context menu. It will return something like `temp1` as the variable name.
2. Chrome also has a `copy()` method, so `copy(temp1)` in the console should copy that object to your clipboard.
3. Note on Recursive Objects: If you're trying to copy a recursive object, you will get `[object Object]`. The way out is to try `copy(JSON.stringify(temp1))` , the object will be fully copied to your clipboard as a valid JSON
4. If you get the `Uncaught TypeError: Converting circular structure to JSON` message, you can use `JSON.stringify`'s second argument (which is a filter function) to filter out the offending circular properties.

   ```
   let cache = [];
   let jsonString = JSON.stringify(temp1, (key, value) => {
   if (typeof value === 'object' && value !== null && value != undefined) {
       if (cache.includes(value)) return;
       cache.push(value);
   }
   return value;
   });
   cache = null; // Enable garbage collection
   copy(jsonString);
   ```
