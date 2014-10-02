public class BlockTower {
	public int getTallest(int[] blockHeights) {
		int i = 0;
		int j = 0;
		int maxSum = 0;
		int sumUpto = 0;

		for (i = 0; i < blockHeights.length; ++i) {
			sumUpto = 0;
			for (j = 0; j < i; ++j) {
				if (blockHeights[j] % 2 == 0)
					sumUpto += blockHeights[j];
			}
			for (; j < blockHeights.length; j++) {
				if (blockHeights[j] % 2 == 1)
					sumUpto += blockHeights[j];
			}
			maxSum = Math.max(maxSum, sumUpto);
		}
		return maxSum;
	}
}
