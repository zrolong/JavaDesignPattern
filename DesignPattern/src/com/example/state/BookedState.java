package com.example.state;

/**
 * 已预订状态
 *
 *@author 北飞的候鸟
 */
public class BookedState implements State {

	@Override
	public void handle() {
		System.out.println("房间已预订！别人不能定！");
	}

}
