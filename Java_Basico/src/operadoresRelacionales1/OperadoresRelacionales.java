package operadoresRelacionales1;

public class OperadoresRelacionales {
	public static void main(String[] args) {
		int i = 8, j = 5;
		float x = 0.005F, y = -0.01F;
		char c = 'c', d = 'd';

		System.out.printf("a) i <= j => %b%n",i <= j);
		System.out.printf("b) c > d => %b%n",c > d);
		System.out.printf("c) x >= 0 => %b%n",x >= 0);
		System.out.printf("d) x < y-- => %b%n",x < y--);
		System.out.printf("e) j != 6 => %b%n",j != 6);
		System.out.printf("f) c == 99 => %b%n",c == 99);
		System.out.printf("g) !(i <= j) => %b%n",!(i <= j));
		System.out.printf("h) !(c == 99) => %b%n",(c == 99));
		System.out.printf("i) !(x > 0) => %b%n",!(x > 0));
		System.out.printf("j) -j == i - 13 => %b%n",-j == i - 13);
		System.out.printf("k) ++x > 0 => %b%n",++x > 0);
		System.out.printf("l) y-- < 1 => %b%n",y-- < 1);
		System.out.printf("m) c > d || c > 0 => %b%n",c > d || c > 0);
		System.out.printf("n) 5 * (i + j) > 'c' => %b%n",5 * (i + j) > 'c');
		System.out.printf("o) 2 * x + y == 0 => %b%n",2 * x + y == 0);
		//System.out.printf("p) 2 * x + (y == 0) => %b%n",2 * x + (y == 0));
		System.out.printf("q) x + y  >= 0 => %b%n",x + y  >= 0);
		System.out.printf("r) x < ++y => %b%n",x < ++y);
		System.out.printf("s) - (i + j) != -i + j => %b%n",- (i + j) != -i + j);
		System.out.printf("t) i <= j && i >= c => %b%n",i <= j && i >= c);
		System.out.printf("u) i > 0 && j < 5 => %b%n",i > 0 && j < 5);
		System.out.printf("v) i > 0 || j < 5 => %b%n",i > 0 || j < 5);
		System.out.printf("w) x > y && i > 0 || j < 5 => %b%n",x > y && i > 0 || j < 5);
		System.out.printf("x) (3 * i - 2 * j) %% (2 * d - c) > 3 * d => %b%n",(3 * i - 2 * j) % (2 * d - c) > 3 * d);
		System.out.printf("y) 2 * ((i / 5) + (4 * (j - 3)) %% (i + j - 2)) >= 10 => %b%n",2 * ((i / 5) + (4 * (j - 3)) % (i + j - 2)) >= 10);
		System.out.printf("z) (i - 3 * j) %% (c + 2 * d) / (x - y) >= 0 => %b%n",(i - 3 * j) % (c + 2 * d) / (x - y) >= 0);
	}
}
