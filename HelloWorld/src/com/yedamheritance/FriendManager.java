package com.yedamheritance;

public class FriendManager {

	public static void main(String[] args) {
		FriendExe app = FriendExe.getInstance();
		app.run();
//		김지수, 010-0103-1111
//		김제니, 010-0116-2222, 예담, 의예과
//		박채영, 010-0212-3333, 구글, 개발팀

		Friend[] friendAry = new Friend[10];
		friendAry[0] = new Friend("김지수", "010-0103-1111");
		friendAry[1] = new ComFriend("박채영", "010-0212-3333", "구글", "개발팀");

		univFriend[] univAry = new UnivFriend[10];
		friendAry[2] = new UnivFriend("김제니", "010-0116-2222", "예담", "의예과");

	}

}
