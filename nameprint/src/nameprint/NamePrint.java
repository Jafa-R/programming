package nameprint;

import java.util.Scanner;

public class NamePrint {

	public static void main(String[] args) { 

		Scanner scan = new Scanner(System.in);
		System.out.print("please enter your name:");
		String name = scan.next();
		System.out.print("please enter the sympol:");
		String sympol = scan.next();

		char arr[] = name.toCharArray();

		for (int i = 0; i < name.length(); i++) {
			char x = arr[i];
			switch (x) {
			case 'a':
			case 'A':
				A(sympol);
				break;
			case 'b':
			case 'B':
				B(sympol);
				break;
			case 'c':
			case 'C':
				C(sympol);
				break;
			case 'd':
			case 'D':
				D(sympol);
				break;
			case 'e':
			case 'E':
				E(sympol);
				break;
			case 'f':
			case 'F':
				F(sympol);
				break;
			case 'g':
			case 'G':
				G(sympol);
				break;
			case 'h':
			case 'H':
				H(sympol);
				break;
			case 'i':
			case 'I':
				I(sympol);
				break;
			case 'j':
			case 'J':
				J(sympol);
				break;
			case 'k':
			case 'K':
				K(sympol);
				break;
			case 'l':
			case 'L':
				L(sympol);
				break;
			case 'm':
			case 'M':
				M(sympol);
				break;
			case 'n':
			case 'N':
				N(sympol);
				break;
			case 'o':
			case 'O':
				O(sympol);
				break;
			case 'p':
			case 'P':
				P(sympol);
				break;
			case 'q':
			case 'Q':
				Q(sympol);
				break;
			case 'r':
			case 'R':
				R(sympol);
				break;
			case 's':
			case 'S':
				S(sympol);
				break;
			case 't':
			case 'T':
				T(sympol);
				break;
			case 'u':
			case 'U':
				U(sympol);
				break;
			case 'v':
			case 'V':
				V(sympol);
				break;
			case 'w':
			case 'W':
				W(sympol);
				break;
			case 'x':
			case 'X':
				X(sympol);
				break;
			case 'y':
			case 'Y':
				Y(sympol);
				break;
			case 'z':
			case 'Z':
				Z(sympol);
				break;
			}

		}

	}

	public static void A(String sympol) {

		for (int row = 1; row <= 5; row++) {
			if (row == 1 || row == 3)
				for (int colum = 1; colum <= 5; colum++) {

					System.out.print(sympol);

				}
			else {
				System.out.print(sympol + "   " + sympol);
			}

			System.out.println();

		}
		System.out.println("============================");
	}

	public static void B(String sympol) {
		for (int row = 1; row <= 5; row++) {
			if (row == 1 || row == 3 || row == 5)
				for (int colum = 1; colum <= 5; colum++) {

					System.out.print(sympol);

				}
			else {
				System.out.print(sympol + "    " + sympol);
			}

			System.out.println();

		}
		System.out.println("============================");
	}

	public static void C(String sympol) {
		for (int row = 1; row <= 5; row++) {
			if (row == 1 || row == 5)
				for (int colum = 1; colum <= 5; colum++) {

					System.out.print(sympol);

				}
			else {
				System.out.print(sympol);
			}

			System.out.println();
		}
		System.out.println("============================");
	}

	public static void D(String sympol) {
		for (int row = 1; row <= 5; row++) {
			if (row == 1 || row == 5)
				for (int colum = 1; colum <= 5; colum++) {

					System.out.print(sympol);

				}
			else {
				System.out.print(sympol + "    " + sympol);
			}

			System.out.println();

		}
		System.out.println("============================");
	}

	public static void E(String sympol) {
		for (int row = 1; row <= 5; row++) {
			if (row == 1 || row == 3 || row == 5)
				for (int colum = 1; colum <= 5; colum++) {

					System.out.print(sympol);

				}
			else {
				System.out.print(sympol);
			}

			System.out.println();

		}
		System.out.println("============================");
	}

	public static void F(String sympol) {
		for (int row = 1; row <= 5; row++) {
			if (row == 1 || row == 3)
				for (int colum = 1; colum <= 5; colum++) {

					System.out.print(sympol);

				}
			else {
				System.out.print(sympol);
			}

			System.out.println();

		}
		System.out.println("============================");
	}

	public static void G(String sympol) {
		for (int row = 1; row <= 5; row++) {
			if (row == 1 || row == 5) {
				System.out.print(" ");
				for (int colum = 1; colum <= 5; colum++) {

					System.out.print(sympol);
				}
			} else if (row == 3) {
				System.out.print(sympol + "  " + sympol + sympol + sympol);
			} else if (row == 2) {
				System.out.print(sympol);
			} else {
				System.out.print(sympol + "     " + sympol);
			}

			System.out.println();
		}
		System.out.println("============================");
	}

	public static void H(String sympol) {
		for (int row = 1; row <= 5; row++) {
			if (row == 3)
				for (int colum = 1; colum <= 5; colum++) {

					System.out.print(sympol);

				}
			else {
				System.out.print(sympol + "   " + sympol);
			}

			System.out.println();
		}
		System.out.println("============================");
	}

	public static void I(String sympol) {
		for (int row = 1; row <= 5; row++) {
			if (row == 1 || row == 5)
				for (int colum = 1; colum <= 5; colum++) {

					System.out.print(sympol);

				}
			else {
				System.out.print("  " + sympol);
			}

			System.out.println();
		}
		System.out.println("============================");
	}

	public static void J(String sympol) {
		for (int row = 1; row <= 5; row++) {
			if (row == 5) {
				System.out.print(" ");
				for (int c = 1; c <= 3; c++) {
					System.out.print(sympol);
				}
			} else if (row == 4) {
				System.out.print(sympol + "   " + sympol);
			}

			else {
				System.out.print("    " + sympol);
			}

			System.out.println();
		}
		System.out.println("============================");
	}

	public static void K(String sympol) {
		System.out.println("============================");
	}

	public static void L(String sympol) {
		for (int row = 1; row <= 5; row++) {
			if (row == 5)
				for (int colum = 1; colum <= 5; colum++) {

					System.out.print(sympol);

				}
			else {
				System.out.print(sympol);
			}

			System.out.println();
		}
		System.out.println("============================");
	}

	public static void M(String sympol) {
		System.out.println("============================");
	}

	public static void N(String sympol) {
		System.out.println("============================");
	}

	public static void O(String sympol) {
		for (int row = 1; row <= 5; row++) {
			if (row == 1 || row == 5) {
				System.out.print(" ");
				for (int colum = 1; colum <= 5; colum++) {

					System.out.print(sympol);
				}
			} else {
				System.out.print(sympol + "     " + sympol);
			}

			System.out.println();
		}
		System.out.println("============================");
	}

	public static void P(String sympol) {
		for (int row = 1; row <= 5; row++) {
			if (row == 1 || row == 3)
				for (int colum = 1; colum <= 5; colum++) {

					System.out.print(sympol);

				}
			else if (row == 4 || row == 5) {
				System.out.print(sympol);
			} else {
				System.out.print(sympol + "    " + sympol);
			}

			System.out.println();
		}
		System.out.println("============================");
	}

	public static void Q(String sympol) {
		System.out.println("============================");
	}

	public static void R(String sympol) {
		for (int row = 1; row <= 5; row++) {
			if (row == 1 || row == 3)
				for (int colum = 1; colum <= 5; colum++) {

					System.out.print(sympol);

				}
			else {
				System.out.print(sympol + "    " + sympol);
			}

			System.out.println();
		}
		System.out.println("============================");
	}

	public static void S(String sympol) {
		for (int row = 1; row <= 5; row++) {
			if (row == 1) {
				System.out.print(" ");
				for (int colum = 1; colum <= 5; colum++) {

					System.out.print(sympol);
				}
			} else if (row == 2) {
				System.out.print(sympol);
			} else if (row == 3) {
				System.out.print(" ");
				for (int colum = 1; colum <= 5; colum++) {

					System.out.print(sympol);
				}
				System.out.print(" ");
			} else if (row == 4) {
				System.out.print("      " + sympol);
			} else if (row == 5) {
				System.out.print(" ");
				for (int colum = 1; colum <= 5; colum++) {

					System.out.print(sympol);
				}
			}

			System.out.println();
		}
		System.out.println("============================");
	}

	public static void T(String sympol) {
		for (int row = 1; row <= 5; row++) {
			if (row == 1)
				for (int colum = 1; colum <= 5; colum++) {

					System.out.print(sympol);

				}
			else {
				System.out.print("  " + sympol);
			}

			System.out.println();
		}
		System.out.println("============================");
	}

	public static void U(String sympol) {
		for (int row = 1; row <= 5; row++) {
			if (row == 5) {
				System.out.print(" ");
				for (int colum = 1; colum <= 5; colum++) {

					System.out.print(sympol);
				}
			} else {
				System.out.print(sympol + "     " + sympol);
			}

			System.out.println();
		}
		System.out.println("============================");
	}

	public static void V(String sympol) {
		System.out.println("============================");
	}

	public static void W(String sympol) {
		System.out.println("============================");
	}

	public static void X(String sympol) {
		System.out.println("============================");
	}

	public static void Y(String sympol) {
		System.out.println("============================");
	}

	public static void Z(String sympol) {
		System.out.println("============================");
	}

}
