import java.util.Scanner;

public class sprintjava {

	public static void main(String[] args) {

		// Scanner
		Scanner entry = new Scanner(System.in);

		// var
		int bateria = 0;
		int bateriaGasta = 0;

		String direcao;

		// RODADA 1

		// carregando bateria
		bateria = 280; // 1distancia = 1bateria

		// inicial
		System.out.println("Bateria inicial: " + bateria);

		System.out.println("");
		System.out.println("Digite a direcao");
		direcao = entry.next().toUpperCase();

		// validacao comando direcao
		while (!(direcao.equalsIgnoreCase("direita")) && !(direcao.equalsIgnoreCase("esquerda"))
				&& !(direcao.equalsIgnoreCase("frente")) && !(direcao.equalsIgnoreCase("tras"))) {

			System.out.println("Digite uma direcao valida DIREITA/ESQUERDA/FRENTE/TRAS");
			direcao = entry.next().toUpperCase();
		}

		// direcao 1
		switch (direcao) {

		case "DIREITA":

			System.out.println("");
			System.out.println("Digite quanta bateria deseja gastar");
			bateriaGasta = entry.nextInt();

			// validacao comando bateria
			while (bateriaGasta > bateria) {
				System.out.println("Voce nao tem bateria suficiente");
				bateriaGasta = entry.nextInt();
			}

			while (true) {
				bateria -= bateriaGasta;

				if (bateria == 220) {
					System.out.println("Bateria restante: " + bateria);
					break;
				} else if (bateria < 220) {
					System.out.println("Voce bateu na parede! GAME OVER ;(");
					System.exit(0);
				}
				System.out.println("Bateria restante: " + bateria);
				System.out.println("");
				System.out.println("Digite quanta bateria deseja gastar para completar o percurso");
				bateriaGasta = entry.nextInt();
			}

			break;

		default:
			System.out.println("Voce digitou a direcao errada e bateu na parede! GAMEOVER :(");
			System.exit(0);

		}

		// RODADA 2

		System.out.println("Digite a nova direcao");
		direcao = entry.next().toUpperCase();

		// validacao comando direcao
		while (!(direcao.equalsIgnoreCase("direita")) && !(direcao.equalsIgnoreCase("esquerda"))
				&& !(direcao.equalsIgnoreCase("frente")) && !(direcao.equalsIgnoreCase("tras"))) {

			System.out.println("Digite uma direcao valida DIREITA/ESQUERDA/FRENTE/TRAS");
			direcao = entry.next().toUpperCase();
		}

		// direcao 2
		switch (direcao) {

		case "TRAS":

			System.out.println("");
			System.out.println("Digite quanta bateria deseja gastar");
			bateriaGasta = entry.nextInt();

			// validacao comando bateria
			while (bateriaGasta > bateria) {
				System.out.println("Digite uma bateria valida");
				bateriaGasta = entry.nextInt();
			}

			while (true) {
				bateria -= bateriaGasta;

				if (bateria == 190) {
					System.out.println("Bateria restante: " + bateria);
					break;
				} else if (bateria < 190) {
					System.out.println("Voce bateu na parede! GAME OVER ;(");
					System.exit(0);
				}
				System.out.println("Bateria restante: " + bateria);
				System.out.println("");
				System.out.println("Digite quanta bateria deseja gastar para completar o percurso");
				bateriaGasta = entry.nextInt();
			}
			break;

		default:
			System.out.println("Voce digitou a direcao errada e bateu na parede! GAMEOVER :(");
			System.exit(0);

		}

		// RODADA 3

		System.out.println("Digite a nova direcao");
		direcao = entry.next().toUpperCase();

		// validacao comando direcao
		while (!(direcao.equalsIgnoreCase("direita")) && !(direcao.equalsIgnoreCase("esquerda"))
				&& !(direcao.equalsIgnoreCase("frente")) && !(direcao.equalsIgnoreCase("tras"))) {

			System.out.println("Digite uma direcao valida DIREITA/ESQUERDA/FRENTE/TRAS");
			direcao = entry.next().toUpperCase();
		}

		// direcao 3
		switch (direcao) {

		case "DIREITA":

			System.out.println("");
			System.out.println("Digite quanta bateria deseja gastar");
			bateriaGasta = entry.nextInt();

			// validacao comando bateria
			while (bateriaGasta > bateria) {
				System.out.println("Digite uma bateria valida");
				bateriaGasta = entry.nextInt();
			}

			while (true) {
				bateria -= bateriaGasta;

				if (bateria == 160) {
					System.out.println("Bateria restante: " + bateria);
					break;
				} else if (bateria < 160) {
					System.out.println("Voce bateu na parede! GAME OVER ;(");
					System.exit(0);
				}
				System.out.println("Bateria restante: " + bateria);
				System.out.println("");
				System.out.println("Digite quanta bateria deseja gastar para completar o percurso");
				bateriaGasta = entry.nextInt();
			}
			break;

		default:
			System.out.println("Voce digitou a direcao errada e bateu na parede! GAMEOVER :(");
			System.exit(0);

		}

		// RODADA 4

		System.out.println("Digite a nova direcao");
		direcao = entry.next().toUpperCase();

		// validacao comando direcao
		while (!(direcao.equalsIgnoreCase("direita")) && !(direcao.equalsIgnoreCase("esquerda"))
				&& !(direcao.equalsIgnoreCase("frente")) && !(direcao.equalsIgnoreCase("tras"))) {

			System.out.println("Digite uma direcao valida DIREITA/ESQUERDA/FRENTE/TRAS");
			direcao = entry.next().toUpperCase();
		}

		// direcao 4
		switch (direcao) {

		case "FRENTE":

			System.out.println("");
			System.out.println("Digite quanta bateria deseja gastar");
			bateriaGasta = entry.nextInt();

			// validacao comando bateria
			while (bateriaGasta > bateria) {
				System.out.println("Digite uma bateria valida");
				bateriaGasta = entry.nextInt();
			}

			while (true) {
				bateria -= bateriaGasta;

				if (bateria == 110) {
					System.out.println("Bateria restante: " + bateria);
					break;
				} else if (bateria < 110) {
					System.out.println("Voce bateu na parede! GAME OVER ;(");
					System.exit(0);
				}
				System.out.println("Bateria restante: " + bateria);
				System.out.println("");
				System.out.println("Digite quanta bateria deseja gastar para completar o percurso");
				bateriaGasta = entry.nextInt();
			}
			break;

		default:
			System.out.println("Voce digitou a direcao errada e bateu na parede! GAMEOVER :(");
			System.exit(0);

		}

		// RODADA 5

		System.out.println("Digite a nova direcao");
		direcao = entry.next().toUpperCase();

		// validacao comando direcao
		while (!(direcao.equalsIgnoreCase("direita")) && !(direcao.equalsIgnoreCase("esquerda"))
				&& !(direcao.equalsIgnoreCase("frente")) && !(direcao.equalsIgnoreCase("tras"))) {

			System.out.println("Digite uma direcao valida DIREITA/ESQUERDA/FRENTE/TRAS");
			direcao = entry.next().toUpperCase();
		}

		// direcao 5
		switch (direcao) {

		case "DIREITA":

			System.out.println("");
			System.out.println("Digite quanta bateria deseja gastar");
			bateriaGasta = entry.nextInt();

			// validacao comando bateria
			while (bateriaGasta > bateria) {
				System.out.println("Digite uma bateria valida");
				bateriaGasta = entry.nextInt();
			}

			while (true) {
				bateria -= bateriaGasta;

				if (bateria == 80) {
					System.out.println("Bateria restante: " + bateria);
					break;
				} else if (bateria < 80) {
					System.out.println("Voce bateu na parede! GAME OVER ;(");
					System.exit(0);
				}
				System.out.println("Bateria restante: " + bateria);
				System.out.println("");
				System.out.println("Digite quanta bateria deseja gastar para completar o percurso");
				bateriaGasta = entry.nextInt();
			}
			break;

		default:
			System.out.println("Voce digitou a direcao errada e bateu na parede! GAMEOVER :(");
			System.exit(0);

		}

		// RODADA 6

		System.out.println("Digite a nova direcao");
		direcao = entry.next().toUpperCase();

		// validacao comando direcao
		while (!(direcao.equalsIgnoreCase("direita")) && !(direcao.equalsIgnoreCase("esquerda"))
				&& !(direcao.equalsIgnoreCase("frente")) && !(direcao.equalsIgnoreCase("tras"))) {

			System.out.println("Digite uma direcao valida DIREITA/ESQUERDA/FRENTE/TRAS");
			direcao = entry.next().toUpperCase();
		}

		// direcao 6
		switch (direcao) {

		case "FRENTE":

			System.out.println("");
			System.out.println("Digite quanta bateria deseja gastar");
			bateriaGasta = entry.nextInt();

			// validacao comando bateria
			while (bateriaGasta > bateria) {
				System.out.println("Digite uma bateria valida");
				bateriaGasta = entry.nextInt();
			}

			while (true) {
				bateria -= bateriaGasta;

				if (bateria == 50) {
					System.out.println("Bateria restante: " + bateria);
					break;
				} else if (bateria < 50) {
					System.out.println("Voce bateu na parede! GAME OVER ;(");
					System.exit(0);
				}
				System.out.println("Bateria restante: " + bateria);
				System.out.println("");
				System.out.println("Digite quanta bateria deseja gastar para completar o percurso");
				bateriaGasta = entry.nextInt();
			}
			break;

		default:
			System.out.println("Voce digitou a direcao errada e bateu na parede! GAMEOVER :(");
			System.exit(0);

		}

		// RODADA 7

		System.out.println("Digite a nova direcao");
		direcao = entry.next().toUpperCase();

		// validacao comando direcao
		while (!(direcao.equalsIgnoreCase("direita")) && !(direcao.equalsIgnoreCase("esquerda"))
				&& !(direcao.equalsIgnoreCase("frente")) && !(direcao.equalsIgnoreCase("tras"))) {

			System.out.println("Digite uma direcao valida DIREITA/ESQUERDA/FRENTE/TRAS");
			direcao = entry.next().toUpperCase();
		}

		// direcao 7
		switch (direcao) {

		case "ESQUERDA":

			System.out.println("");
			System.out.println("Digite quanta bateria deseja gastar");
			bateriaGasta = entry.nextInt();

			// validacao comando bateria
			while (bateriaGasta > bateria) {
				System.out.println("Digite uma bateria valida");
				bateriaGasta = entry.nextInt();
			}

			while (true) {
				bateria -= bateriaGasta;

				if (bateria == 0) {
					System.out.println("Voce completou o percurso! Parabens!");
					System.exit(0);
				} else if (bateria < 0) {
					System.out.println("Voce ficou sem bateria e nao completou o percurso! GAME OVER ;(");
					System.exit(0);
				}
				System.out.println("Bateria restante: " + bateria);
				System.out.println("");
				System.out.println("Digite quanta bateria deseja gastar para completar o percurso");
				bateriaGasta = entry.nextInt();
			}

		default:
			System.out.println("Voce digitou a direcao errada e bateu na parede! GAMEOVER :(");
			System.exit(0);

		}

	}

}
