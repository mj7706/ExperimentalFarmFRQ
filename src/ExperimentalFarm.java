import java.util.ArrayList;

public class ExperimentalFarm
{
    private Plot[][] farmPlots;

    public ExperimentalFarm(Plot[][] p)
    {
        farmPlots = p;
    }

    /** Returns the plot with the highest yield
     * for a given crop type, as described in part (a).
     */
    public Plot getHighestYield(String c)
    {
        /* to be implemented in part (a) */
        Plot highestPlot = farmPlots[0][0];
        for (int row = 0; row < farmPlots.length(); row++) {
            for (int col = 0; c < farmPlots[0].length(); col++) {
                if (farmPlots[row][col].getCropYield() > highestPlot.getCropYield()) {

                }
            }
        }

        return null; // stub value
    }

    /** Returns true if all plots in a given column in
     * the two-dimensional array farmPlots
     * contain the same type of crop, or false otherwise,
     * as described in part (b).
     */
    public boolean sameCrop(int col)
    {
        /* to be implemented in part (b) */

        return false; // stub value
    }

    /** Returns an arraylist of Plots
     * that are growing crop "crop",
     * as described in part (c).
     */
    public ArrayList<Plot> plotsWithCrop(String crop)
    {
        /* to be implemented in part (c) */

        return new ArrayList<Plot>(); // stub value
    }
}
