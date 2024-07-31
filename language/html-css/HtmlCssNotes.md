# HTML & CSS

## CSS

### Striped Background [link](https://blog.logrocket.com/5-ways-implement-striped-background-css-only/#linear-gradient-striped-background)

1. linear-gradient() : A linear-gradient has two or more colors transitioning in a straight line. We can specify where each color starts by using a percentage or px value. The number of stripes will determine the percentage values for the color stops. Whatever number of stripes you want, divide 100 by that number to get the percentage value for the first color stop and progress from there.

For example, if we want four stripes, you can use percentage values for the color stops like so:

```
0% to 25%
25% to 50
50% to 75%
75% to 100%
```

We’ll use two colors — #553c9a and #b393d3 — for this example. We’re going for five evenly spaced stripes:

```
  background-image: linear-gradient(
    #553c9a 0%,
    #553c9a 20%,
    #b393d3 20%,
    #b393d3 40%,
    #553c9a 40%,
    #553c9a 60%,
    #b393d3 60%,
    #b393d3 80%,
    #553c9a 80%,
    #553c9a 100%
  );
```

By default, a linear-gradient moves from top to bottom. We can also change direction.

2. repeating-linear-gradient() - One disadvantage of using linear-gradient to create your striped background is that if you want more stripes, you’ll need more color stops.
   A different way to create a background with more stripes is by using a repeating-linear-gradient instead. You just need to add in enough color stops to set your desired pattern, and it’ll repeat the gradient pattern throughout the background

```
background-image: repeating-linear-gradient(
  45deg,
  #553c9a,
  #553c9a 50px,
  #b393d3 50px,
  #b393d3 100px
);
```

Using just four color stops, you get a striped pattern that repeats throughout the background.

3. radial-gradient() - to create circular gradients in CSS
4. repeating-radial-gradient() - to create circular gradients in CSS
5. conic-gradient() - This gradient rotates around a point of origin
