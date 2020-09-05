package kh.dgv.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import kh.dgv.model.vo.Drinking;
import kh.dgv.model.vo.Movies;
import kh.dgv.model.vo.Popcorn;
import kh.dgv.model.vo.Product;
import kh.dgv.model.vo.SelectedMenu;


public class View {

	Scanner sc;
	SimpleDateFormat timeFormat;
	SimpleDateFormat runningTimeFormat;
	public View(){
		timeFormat = new SimpleDateFormat("yyyy�� M�� d�� H�� m��");
		runningTimeFormat = new SimpleDateFormat("h�ð� mm��");
		sc=new Scanner(System.in);
	}
	public void enterMessage() {
		System.out.println("\nDGV�� ���Ű��� ȯ���մϴ�.\n");
		System.out.println("\n\t1.�˹ٻ�\n\t2.�մ�\n\t0.����\n");
		System.out.println("\t\t\t��ȭ�� ����DGV");
		System.out.print("���� >");
	}
	public void enterAdminMessage() {
		System.out.println("\n\t �ȳ�, �̼�����!\n");
		System.out.println("\t 1.��ȭ �߰��ϱ�");
		System.out.println("\t 2.��ȭ �����ϱ�");
		System.out.println("\t 3.��ȭ �����ϱ�");
		System.out.println("\t 4.������ ��ȭ\n");
		
		System.out.println("\t DGV ����");
		System.out.println("\t 5.��� ��Ȳ����");
		System.out.println("\t 6.��ǰ���");
		System.out.println("\t 7.��ǰ����");
		System.out.println("\t 8.��ǰ����\n");
		System.out.println("\t 0. ���� ȭ������\n");
		System.out.print("���� >");
	}
	public void enterGuestMessage() {
		System.out.println("\n\t1. ��       ȭ   \t��");
		System.out.println("\t2. ��\t\t��");
		System.out.println("\n\t0. ���� ȭ�� ����");
		System.out.print("\n���� >");
	}
	public void enterGuestMovieMessage() {
		System.out.println("\n\t1. ��ȭ ���� �ϱ�");
		System.out.println("\t2. ���� ���� Ȯ��");
		System.out.println("\t3. ��ȭ ���� ���");
		System.out.println("\n\t0. ���� ȭ�� ����");
		System.out.print("\n���� >");
	}
	public void enterGuestStoreMessage() {
		System.out.println("\n\t1. ���� ���� �ϱ�\n");
		System.out.println("\t0. ���� ȭ�� ����");
		System.out.print("\n���� >");
	}
	public void enterStoreShoppingMessage() {
		System.out.println("\n\t1.���ᱸ��");
		System.out.println("\t2.���ı���");
		System.out.println("\t3.���ܱ���\n");
		System.out.println("\t0. ���� ȭ�� ����");
		System.out.print("\n���� >");
	}
	public void initAdminInsertProductMessage() {
		System.out.println("\tDGV ����");
		System.out.println("\t��ǰ ���");
		System.out.println("\n\t1.������");
		System.out.println("\t2.���ĵ��");
		System.out.println("\t3.���ܵ��\n");
		System.out.println("\t0. ���� ȭ�� ����");
		System.out.print("\n���� >");
	}
	public void insertMovieMessage() {
		System.out.println("\t���ο� ��ȭ�� ���� �Ƴ�������.");
		System.out.printf("����ϰ� ���� ��ȭ�� ������ �Է��ϼ��� >");

	}
	public void printOutOfMovies() {
		System.out.println("���� ������ ��ȭ�� �����ϴ�.");
	}
	public void printOutOfStocks() {
		System.out.println("���� ��ǰ �� ����� �����ϴ�.");
	}
	public void printFullOfMovies() {
		System.out.println("���� �󿵰��� ���� á���ϴ�.");
	}
	public void printFullOfStocks() {
		System.out.println("���� â���� ���� á���ϴ�.");
	}
	public void insertDoneMessage() {
		System.out.println("���������� �߰��Ǿ����ϴ�.");
	}
	public void notEnoughSpaceMessage() {
		System.out.println("������ �����Ͽ� �������� ���Ͽ����ϴ�.");
	}
	public void selectMoviesMessage(String purpose,int idx) {
		System.out.printf("\n%s�Ϸ��� ��ȭ��  No.�� ������ �ּ��� [1~%d]:",purpose,idx);
	}
	public int selectModifyNameOrTimeOrRunningTime() {
		System.out.println("������ �����Ͻðڽ��ϱ�?");
		System.out.println("\n\t1.��ȭ ����");
		System.out.println("\t2.���� �ð�");
		System.out.println("\t3.�� �ð�");
		System.out.println("\t0. ���� ȭ�� ����");
		System.out.print("\n���� >");
		return sc.nextInt();
	}
	public void modifyMovieNameMessage() {
		System.out.print("�����ϰ� ���� �� ������ �Է��ϼ���. :");
	}
	public void modifyMovieDoneMessage(String str) {
		System.out.printf("%s���� ����Ǿ����ϴ�.\n",str);
	}
	public void modifyMovieStartTimeMessage() {
		System.out.print("�����ϰ� ���� �� ���۽ð��� �Է��ϼ���. :");
	}
	
	public void modfiyMovieRunningTimeMessage() {
		System.out.print("�����ϰ� ���� �� �� �ð��� �Է��ϼ���. [HH:mm]:");
	}
	
	public void deleteConfrimMessage(Movies movie) {
		System.out.printf("%s��ȭ�� �����߽��ϴ�.\n",movie.getName());
		System.out.printf("���� �����Ͻðڽ��ϱ�? [y/n] :");
	}
	public void printSelectMovieNumber(String purpose) {
		System.out.printf("%s�ϰ����� ��ȭ�� No.�� �Է����ּ���",purpose);
	}
	public void printSelectedMovieName(String purpose) {
		System.out.printf("�����Ͻ� ��ȭ�� ������ %s�Դϴ�.\n",purpose);
	}
	public void printAskingAmountOfTicket() {
		System.out.print("�� �� �����Ͻðھ�� ? :");
	}
	public void printAskTicketSeats(int NumberOfTickets) {
		System.out.printf("%d ��° �մ� ���� ���͵帮�ڽ��ϴ�. \n",NumberOfTickets);
		System.out.print("�¼��߿� ��� ���� �Ͻðھ��? (A~J): ");
	}
	public void printAskNumOfSeat(char ch) {
		System.out.printf("%c���� �� ���ڸ��� �Ͻðھ��? (1~10):",ch);
	}
	public void printAlreadyOccupiedSeat() {
		System.out.println("�̹� ������ �ڸ��� �ֽ��ϴ�.");
	}
	public void printCancelTicketId() {
		System.out.print("���Ž� �ο����� ID�� �Է��ϼ���. :");
	}
	public void printCancelFail() {
		System.out.println("�´� ��ȣ�� �����ϴ�.");
	}
	public void printCancelSucess() {
		System.out.println("��� �Ǿ����ϴ�.");
	}
	public void printSeats(Movies movie){
		

		Date start,end;
		System.out.println("No.\t��ȭ����\t\t���۽ð�\t\t\t\t����ð�\t\t\t\t�󿵽ð�");
		end = new Date(movie.getEndTime().getTimeInMillis());
		start = new Date(movie.getStartTime().getTimeInMillis());
		System.out.printf("%d.\t%s\t\t%s\t\t%s\t\t%s\n",movie.getIndex(),movie.getName(),
								timeFormat.format(start),timeFormat.format(end),movie.getRunningTime());
		System.out.println("\t ��������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
		System.out.println("\t ��������������������������������������������������������������������������������������������������������������������������������������������������������������������������");
		
		System.out.print("\t");
		for(int List_i=0;List_i<movie.horizontalSeats;++List_i) {
			System.out.print(List_i+1+"\t");
		}
		System.out.println();
		
		for(int width=0;width<movie.verticalSeats;++width) {
			System.out.print("\n "+(char)('A'+width)+"��\t");
			for(int length=0;length<movie.horizontalSeats;++length) {
				if(movie.isChecked(width,length)) {
					System.out.print("��\t");
				}
				else{
					System.out.print("��\t");
				}
			}
		}
		System.out.println();
	}

	public SelectedMenu productSelectMessage() {
		buyingMessage("No.");
		int no = sc.nextInt();
		buyingMessage("����");
		int amount = sc.nextInt();
		return new SelectedMenu(no,amount);
	}
	public void buyingMessage(String str) {
		System.out.printf("������ ��ǰ�� %s(��)�� �������ּ��� :",str);
	}
	public void productMenuMessage(Product[] product,String kind,int idx) {
		System.out.println("������������������������������������������������������������������������������������������������");
		System.out.printf("\t\t%s\n",kind);
		System.out.println("No.\t��ǰ��\t����\t����");
		printAllProductForMenu(product,idx);
		System.out.println("������������������������������������������������������������������������������������������������");
	}
	public void printAllProductForMenu(Product[] product,int idx) {
		for(int List_i=0;List_i<idx;++List_i) {
			printProduct(product[List_i]);
		}
	}
	public void printProduct(Product product) {
		System.out.printf("No.%d\t%s\t%d\t%d\n",product.getIndex()+1,product.getName(),product.getAmount()
				,product.getPrice());
	}
	
	public void popcornMenuMessage(Popcorn[] popcorn,int idx) {
		System.out.println("������������������������������������������������������������������������������������������������");
		System.out.println("\t\t         ����\n");
		System.out.println("No.\t��ǰ��\t\t����\t����\t��\n");
		printAllPopcornForMenu(popcorn,idx);
		System.out.println("������������������������������������������������������������������������������������������������");
	}
	public void printAllPopcornForMenu(Popcorn[] popcorn,int idx) {
		for(int List_i=0;List_i<idx;++List_i) {
			printPopcorn(popcorn[List_i]);
		}
	}
	public void printPopcorn(Popcorn popcorn) {
		System.out.printf("No.%d\t%s\t%s\t%s\t%s\n",popcorn.getIndex()+1,popcorn.getName(),popcorn.getAmount()
				,popcorn.getPrice(),popcorn.getFlavor());
	}
	public void buyingDoneMessage() {

		System.out.println("���� �Ϸ��߽��ϴ�.");
	}
	
	public void deleteDoneMessage() {
		System.out.println("���� �Ϸ�");
	}
	public void foodMenuMessage() {
		
	}
	public void productNameInsertMessage(String product) {
		System.out.printf("�߰��� %s�� �̸��� �Է����ּ��� : ",product);
	}
	public void productAmountInsertMessage(String product) {
		System.out.printf("�߰��� %s�� ����� �Է����ּ��� :", product);
	}
	public void productPriceInsertMessage(String product) {
		System.out.printf("�߰��� %s�� ������ �Է����ּ��� :",product);
	}
	public void popcornFlavorInsertMessage(String product) {
		System.out.printf("�߰��� %s�� ���� �Է����ּ��� :",product);
	}
	public void popcornMenuMessage() {

	}
	
	public void printTicketDoneMessage(int Id) {
		System.out.printf("�������� ID�� %d �Դϴ�.\n",Id);
		System.out.println("�ο������� ID�� ���ų��� Ȯ���̳� ������ҽ� ���˴ϴ�. ���� ���� �輼��!");
	}
	public void initAdminModifyProductMessage() {
		System.out.println("\tDGV ����");
		System.out.println("\t��ǰ ����");
		System.out.println("\n\t1.�������");
		System.out.println("\t2.���ļ���");
		System.out.println("\t3.���ܼ���\n");
		System.out.println("\t0. ���� ȭ�� ����");
		System.out.print("\n���� >");
	}
	public void modifyProductMessage(Product[] product,int idx) {
		printAllProductForMenu(product, idx);
		System.out.println("����� ������ ��ǰ�� No.�� �������ּ���.");
		System.out.print("���� >");
	}
	public void printProductSelectedMessage(Product product) {
		System.out.printf("%s ��ǰ�� �����ϼ̽��ϴ�.\n",product.getName());
		System.out.printf("���� ����� %d���Դϴ�.\n",product.getAmount());
		System.out.println("��� �������� �Է����ּ���.");
		System.out.print("\n���� >");
	}
	public void printProductModifyedMessage(int amount) {
		System.out.printf("%d���� ���� �Ϸ�Ǿ����ϴ�.\n",amount);
	}
	
	public void initAdminDeleteProductMessage() {
		System.out.println("\tDGV ����");
		System.out.println("\t��ǰ ����");
		System.out.println("\n\t1.�������");
		System.out.println("\t2.���Ļ���");
		System.out.println("\t3.���ܻ���\n");
		System.out.println("\t0. ���� ȭ�� ����");
		System.out.println("������ ��ǰ�� ī�װ����� ������ �ּ���.");
		System.out.print("\n���� >");
	}
 
	public void printAllStoreStuffs(Product[] drinking,int drinkingIdx
			,Product[] food,int foodIdx,Popcorn[] popcorn, int popcornIdx) {
		productMenuMessage(drinking,"����",drinkingIdx);
		productMenuMessage(food,"����",foodIdx);
		popcornMenuMessage(popcorn,popcornIdx);
	}
	public void printAllMovies(Movies[] movies,int idx) {
		for(int List_i=0;List_i<idx;++List_i) {
			printSeats(movies[List_i]);
		}
	}
	
}