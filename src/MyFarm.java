public class MyFarm {

    public Plot[][] grid;

    public static void main(String[] args) {
        MyFarm garden = new MyFarm();
    }

    public MyFarm() {

        // construct a 2D grid of plots
        grid = new Plot[5][4];
        // fill a 2D grid of plots
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.println("planting at row " + i + ", column " + j);
                grid[i][j] = new Plot();
                grid[i][j].printPlotInfo();


            }
        }

        // methods to write together during class
        totalPlants();
        totalCarrots();
        averageNumberOfPlants();
        numberOfTomatoPlots();
        numberOfEmptyPlots();
        everyOtherNeedsWater();

        /***
         * for each additional method you code, call it here
         */


    }

    public void totalPlants() {
        int total = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                total += grid[i][j].numberOfPlants;
            }
        }
        System.out.println("Total number of plants: " + total);
    }

    public void totalCarrots() {
        int totalCarrots = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j].plantName.equals("carrot")) {
                    totalCarrots += grid[i][j].numberOfPlants;


                }
            }
        }
        System.out.println("Total number of carrots: " + totalCarrots);
    }

    public void averageNumberOfPlants() {
        int totalPlants = 0;
        int totalPlots = grid.length * grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                totalPlants += grid[i][j].numberOfPlants;
            }
        }
        double average = (double) totalPlants / totalPlots;
        System.out.println("average plants per plot: " + average);

    }

    public void numberOfTomatoPlots() {
        int tomatoPlots = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j].plantName.equals("tomato")) {
                    tomatoPlots++;
                }
            }
        }
        System.out.println("tomato plots: " + tomatoPlots);

    }

    public void numberOfEmptyPlots() {
        int emptyPlots = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j].plantName.equals("empty")) {
                    emptyPlots++;
                }
            }
        }
        System.out.println("empty plots: " + emptyPlots);

    }

    public void everyOtherNeedsWater() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if ((i + j) % 2 == 0) {
                    grid[i][j].needsWater = true;
                }
                System.out.println("Plot at row " + i + ", column " + j + " needs water: " + grid[i][j].needsWater);
            }
        }

    }

    public void plantWithMaxNumber() {
        // which plant type has the most total plants?

    }

    public void plantWithMinNumber() {
        // which plant type has the least total plants (not counting empty plots)?

    }

    public void greaterThan50() {
        // how many plots have more than 10 plants in the plot?

    }

    public void plantWithMaxNumberNeedsWater() {
        // which plant type has the most total plants (not counting empty plots) that needs water?

    }


    /***
     * more challenging
     */


    public void averageRows() {
        // find the average number of plants for every row
        // place the average of every row into a new array

    }

    public void averageColumns() {
        // find the average number of plants for every col
        // place the average of every row into a new array

    }

    public void updateNeedsWater() {
        // if 2 or more of the adjacent plots need water (left, right, up, down),
        // make the current plot needs water to be true

    }


    /***
     * most challenging
     */


    public void greatestDifferenceNumberBetweenAnyAdjacentPlants() {
        // of every pair of adjacent plots
        // (top, bottom, left, right, top-right, top-left, bottom-left, bottom-right),
        // which two have the greatest difference in plant numbers?
        // what is that difference?

    }

    public void updateNumberOfPlants() {
        // change the value of number of plants so it is the average of the 8 surrounding plots
        // (top, bottom, left, right, top-right, top-left, bottom-left, bottom-right)
    }

    public void numberOfCarrotPlotsNextToCorn() {
        // how many carrot plots share a border with a corn plot?

    }

}
