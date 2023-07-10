package emaillist.main;

import java.util.List;
import java.util.Scanner;

import emaillist.dao.EmaillistDao;
import emaillist.vo.EmaillistVo;

public class EmaillistApp {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		while(true) {
			System.out.print("(l)ist (d)elete (i)nsert (q)uit > ");
			String command = scanner.nextLine();
			
			if("q".equals(command)) {
				break;
			} else if("l".equals(command)) {
				doList();
			} else if("d".equals(command)) {
				doDelete();
			} else if("i".equals(command)) {
				doInsert();
			}
		}
	}

	private static void doInsert() {
		System.out.print("성:");
		String firstName = scanner.nextLine();

		System.out.print("이름:");
		String lastName = scanner.nextLine();
		
		System.out.print("이메일:");
		String email = scanner.nextLine();
		
		
	}

	private static void doDelete() {
	}

	private static void doList() {
		List<EmaillistVo> list= new EmaillistDao().findAll();
		for(EmaillistVo vo : list) {
			System.out.println(vo.getFirstName() + " " + vo.getLastName() + " - " + vo.getEmail());
		}
	}
}
