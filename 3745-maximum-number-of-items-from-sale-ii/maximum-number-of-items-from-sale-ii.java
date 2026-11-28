class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int cheapestItem = Integer.MAX_VALUE;

        int[] frq = new int[n + 1];

        for(int[] item : items) {
            frq[item[0]]++;
            cheapestItem = Math.min(cheapestItem, item[1]);
        }

        int[] fSum = new int[n + 1];

        for(int i = 1; i <= n; i++) {
            for(int j = i; j <= n; j += i) {
                fSum[i] += frq[j];
            }
        }

        List<int[]> units = new ArrayList<>();

        for(int[] item : items) {
            int count = fSum[item[0]] - 1;
            if(count > 0 && item[1] < 2 * cheapestItem) {
                units.add(new int[]{item[1], count});
            }
        }

        units.sort((a, b) -> Integer.compare(a[0], b[0]));
        int res = 0;

        for(int[] unit : units) {

            int price = unit[0];
            int fCount = unit[1];

            int k = Math.min(fCount, budget / price);

            budget -= k * price;
            res += 2 * k;
        }

        res += budget / cheapestItem;
        return res;
    }
}