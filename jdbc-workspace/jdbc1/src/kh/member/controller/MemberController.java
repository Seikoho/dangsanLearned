package kh.member.controller;

import java.util.ArrayList;
import java.util.Scanner;

import kh.member.model.dao.MemberDao;
import kh.member.model.vo.Member;
/*
 * 1. statement /prepareed statement
 * 1) 캐시 메모리 사용
 * 객체 생성시 sql 문법 검사완료 (parsing)
 * 문법에 문제가 없는 경우 캐시 메모리에sql query 저장
 * 같은 query 를 다시 수행하는 경우 캐시에 있는 데이터를 이용하여 바로 수행하기 떄문에 속도가 빠름
 * 
 * 2) SQL INJECTION 방지
 * 인자값이 없는 상태로 문법검사를 완료하고 인자를 대입하기 떄문에 SQL의 노출이 없고
 * 보안성이 더 높다.'or' + '1'
 */
public class MemberController {
	Scanner sc;
	MemberDao dao;

	public MemberController() {
		super();
		sc = new Scanner(System.in);
		dao = new MemberDao();

	}

	public void main() {
		while (true) {
			System.out.println("\n=== 회원 관리 프로그램 ===");
			System.out.println("1. 전체회원 정보 출력");
			System.out.println("2. 아이디로 회원 출력(1명)");
			System.out.println("3. 이름으로 회원 조회");
			System.out.println("4. 회원 등록");
			System.out.println("5. 회원 정보 수정");
			System.out.println("6. 회원 정보 삭제");
			System.out.println("0. 종료");
			System.out.print("선택 >");
			int sel = sc.nextInt();
			switch (sel) {
			case 1:
				selectAllMember();
				break;
			case 2:
				selectOneMember();
				break;
			case 3:
				selectMemberByName();
				break;
			case 4:
				insertMember();
				break;
			case 5:
				updateMember();
				break;
			case 6:
				deleteMember();
				break;
			default:
				System.exit(0);
			}
		}
	}
	private void selectMemberByName() {
		System.out.print("검색할 이름 입력 :");
		String Name = sc.next();
		Member e = dao.selectOneMemberByName(Name);
		if(e==null) {
			System.out.println("찾을수 없음");
		} else {
			e.printMember();
		}
	}

	private void updateMember() {
		System.out.print("수정할 아이디 입력 :");
		String Id = sc.next();
		Member e = dao.selectOneMemberById(Id);
		if (e == null) {
			System.out.println("멤버가 없음");
		} else {
		System.out.print("비밀번호 입력: ");
		e.setMemberPw(sc.next());
		
		System.out.print("성별 입력[남/여]: ");
		e.setGender(sc.next().charAt(0));
		
		System.out.print("전화 번호 입력[000-0000-0000]: ");
		e.setPhone(sc.next());
		System.out.printf("%d 개 행이 수정 되었습니다.",dao.updateMember(e));
		}
		
	}

	private void deleteMember() {
		System.out.println("=== 회원삭제 ===");
		System.out.print("삭제할 no 입력 :");
		String no = sc.next();
		System.out.printf("%d 개 행이 삭제되었습니다.",dao.deleteMember(no));
	}

	public void insertMember() {
		System.out.println("=== 회원등록 ===");
		Member e = new Member();
		System.out.print("아이디 입력: ");
		e.setMemberId(sc.next());
		
		System.out.print("비밀번호 입력: ");
		e.setMemberPw(sc.next());
		
		System.out.print("이름 입력: ");
		e.setMemberName(sc.next());
		
		System.out.print("나이 입력: ");
		e.setAge(sc.nextInt());
		
		System.out.print("성별 입력[남/여]: ");
		e.setGender(sc.next().charAt(0));
		
		System.out.print("전화 번호 입력[000-0000-0000]: ");
		e.setPhone(sc.next());
		
		System.out.printf("%d 개 행이 추가 되었습니다.",dao.insertMember(e));
	}
	public void selectOneMember() {
		System.out.print("조회할 아이디 입력 :");
		String Id = sc.next();
		Member e = dao.selectOneMemberById(Id);
		if (e == null) {
			System.out.println("멤버가 없음");
		} else {
			System.out.println("번호\t아이디\t\t비밀번호\t이름\t\t성별\t전화번호\t가입일자");
			System.out.printf("%s", e.getMemberNo());
			System.out.printf("\t%s", e.getMemberId());
			System.out.printf("\t%s", e.getMemberPw());
			System.out.printf("\t%s", e.getMemberName());
			System.out.printf("\t%c", e.getGender());
			System.out.printf("\t%s", e.getPhone());
			System.out.printf("\t%s", e.getEnrollDate());
			System.out.println();
		}
	}

	public void selectAllMember() {
		ArrayList<Member> list = dao.selectAllMember();
		if (list.isEmpty()) {
			System.out.println("멤버가 없음");
		} else {
			System.out.println("번호\t아이디\t비밀번호\t이름\t성별\t전화번호\t가입일자");
			for (Member e : list) {
				System.out.printf("%s", e.getMemberNo());
				System.out.printf("\t%s", e.getMemberId());
				System.out.printf("\t%s", e.getMemberPw());
				System.out.printf("\t%s", e.getMemberName());
				System.out.printf("\t%c", e.getGender());
				System.out.printf("\t%s", e.getEnrollDate());
				System.out.println();
			}
		}
	}
}
