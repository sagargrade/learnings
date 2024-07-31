import Chart from "chart.js/auto";
import pattern from "patternomaly";

const ctx = document.getElementById("myChart");

let chart = new Chart(ctx, {
  type: "bar",
  data: {
    labels: ["Red", "Blue", "Yellow", "Green", "Purple", "Orange"],
    datasets: [
      {
        label: "# of Votes",
        data: [12, 19, 3, 5, 2, 3],
        borderWidth: 1,
        backgroundColor: pattern.draw(
          "diagonal-right-left" /* shapeType */,
          "rgb(179, 179, 179)" /* backgroundColor */,
          "rgb(237, 108, 111)" /* pattern color */
        ),
      },
    ],
  },
  options: {
    scales: {
      y: {
        beginAtZero: true,
      },
    },
  },
});
