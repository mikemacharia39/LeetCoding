package javasolutionsforalgorithms.revision_v2.hackerrank.implementation;

/**
 * An avid hiker keeps meticulous records of their hikes.
 * During the last hike that took exactly *steps* steps, for every step it was noted if it was an uphill, U, or a downhill, D  step.
 * Hikes always start and end at sea level, and each step up or down represents a  unit change in altitude.
 * We define the following terms:
 * <p>
 * A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a
 * step down to sea level.
 * A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a
 * step up to sea level.
 * Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.
 * <p>
 * Sample Input
 * steps = 8
 * path = UDDDUDUU
 * <p>
 * Sample Output
 * 1
 * <p>
 * Explanation
 * If we represent _ as sea level, a step up as /, and a step down as \, the hike can be drawn as:
 * <p>
 * _/\      _
 * \    /
 * \/\/
 */
public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        int timesGoneToSeaLevelFromValley = 0;
        int trackAllSteps = 0;
        int previousStep = 0;

        char[] allSteps = path.toCharArray();
        for (char aStep : allSteps) {
            switch (aStep) {
                case 'U':
                    trackAllSteps++;
                    break;
                case 'D':
                    trackAllSteps--;
                    break;
                default:
                    break;
            }

            if (trackAllSteps == 0 && previousStep < 0) {
                timesGoneToSeaLevelFromValley++;
            }

            previousStep = trackAllSteps;
        }

        return timesGoneToSeaLevelFromValley;
    }
}
