	public static long nextBiggerNumber(long n)
    {
		String number = String.valueOf(n);
		char[] chNumber = number.toCharArray();
		for (int i = chNumber.length - 2; i >= 0; i--) {
			for (int j = chNumber.length - 1; j > i; j--) {
				if (chNumber[i] < chNumber[j]) {
					char swap = chNumber[i];
					chNumber[i] = chNumber[j];
					chNumber[j] = swap;
					number = String.valueOf(chNumber);
					String output = number.substring(0, i + 1) + smallestNumber(number.substring(i + 1));
					n = Long.parseLong(output);
					return n;
				}else {
					n = -1;
				}
			}
			
		}
		
      return n;
    }

	private static String smallestNumber(String number) {
		
		char[] chNumber = number.toCharArray();
		for (int i = 0; i < chNumber.length; i++) {
			for (int j = i + 1; j < chNumber.length; j++) {
				if (chNumber[i] > chNumber[j]) {
					char swap = chNumber[i];
					chNumber[i] = chNumber[j];
					chNumber[j] = swap;
					number = String.valueOf(chNumber);
				}
			}
		}
		
		
		return number;
	}
