package operadoreIncrementoYDecremento3;

public class OperadoresIncDec {
	public static void main(String[] args) {
		int i = 1, j = 1, k = 1;
		i = 1; j = 1; k = 1;
		i = ++j;
		System.out.printf("a) i = ++j; => i = %d, j = %d, k = %d", 
					i, j, k);
		i = 1; j = 1; k = 1;
		i = k++;
		System.out.printf("\nb) i = k++; => i = %d, j = %d, k = %d", 
					i, j, k);
		i = 1; j = 1; k = 1;
		i = k + ++j;
		System.out.printf("\nc) i = k + ++j; => i = %d, j = %xd, k = %d",
					i, j, k);
		i = 1; j = 1; k = 1;
		i = i + j++;
		System.out.printf("\nd) i = i + j++; => i = %d, j = %d, k = %d",
					i, j, k);
		i = 1; j = 1; k = 1;
		i = j + ++k;
		System.out.printf("\ne) i = j + ++k; => i = %d, j = %xd, k = %d",i, j, k);
		i = 1; j = 1; k = 1;
		i = ++j + k++;
		System.out.printf("\nf) i = ++j + k++; => i = %x, j = %x, k = %x", i, j, k);
		i = 1; j = 1; k = 1;
		j = k-- + --i;
		System.out.printf("\ng) j = k-- + --i; => i = %d, j = %d, k = %d", i, j, k);
		i = 1; j = 1; k = 1;
		i = k + 1 + ++j;
		System.out.printf("\nh) i = k + 1 + ++j; => i = %d, j = %d, k = %d", i, j, k);
		i = 1; j = 1; k = 1;
		i = ++i + --j + k--;
		System.out.printf("\ni) i = ++i + --j + k--; => i = %d, j = %d, k = %d", i, j, k);
		i = 1; j = 1; k = 1;
		k = j-- + ++k;
		System.out.printf("\nj) k = j-- + ++k; => i = %d, j = %d, k = %d", i, j, k);
	}
}
