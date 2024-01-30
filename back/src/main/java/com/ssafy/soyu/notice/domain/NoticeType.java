package com.ssafy.soyu.notice.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 알림 타입 ENUM<br/>
 * - DP_SELL : 오프라인에서 판매<br/>
 * - RESERVE_SELL : 예약된 거래 물품 판매 완료<br/>
 * - RESERVE_CANCEL : 예약된 거래 취소(보관 전)<br/>
 * - CONVERT : 예약된 거래 취소(이미 보관)<br/>
 * - LIKE : 판매 중인 물품 찜<br/>
 * - DP-POSSIBLE : DP 가능 해졌을 때<br/>
 * - CHAT : 메세지 도착 시 알림<br/>
 * - RESERVE : 보관함 예약 성공시 알림 (코드 포함)<br/>
 * - BUY : 판매자가 물품 보관 시 구매자에게 알림 (코드 포함)<br/>
 * - RETURN : 회수 알림 (코드 포함)<br/>
 * - DISCOUNT : DP 중인 물품 할인 안내<br/>
 * - CHOICE : 할인 될지 회수 할 지 선택 알림<br/>
 */
@Getter
@AllArgsConstructor
public enum NoticeType {
  DP_SELL("물품 판매 완료","DP된 물품이 판매되었습니다."),
  RESERVE_SELL("물품 판매 완료","거래 예약된 물품이 판매되었습니다."),
  RESERVE_CANCEL("물품 거래 취소","거래 예약이 취소되었습니다."),
  CONVERT("물품 거래 취소","거래 예약이 취소되었습니다."),
  LIKE("찜","누군가 물품을 찜하였습니다."),
  DP_POSSIBLE("온라인 DP 가능","물품이 DP 조건을 충족하였습니다."),
  CHAT("",""),
  RESERVE("소유박스 예약 완료","소유박스의 예약이 완료되었습니다."),
  BUY("소유박스 보관 완료","판매자가 물품을 소유박스에 보관하였습니다."),
  RETURN("회수 신천 완료","물품의 회수 신청이 완료되었습니다."),
  DISCOUNT("DP 물품 할인 안내","DP 중인 물품에 할인이 적용되었습니다."),
  CHOICE("DP 물품 할인 예정 안내","DP 중인 물품이 3시간 뒤 할인이 적용됩니다.");

  private final String title;
  private final String content;
}
