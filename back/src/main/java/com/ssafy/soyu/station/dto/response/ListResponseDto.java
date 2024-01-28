package com.ssafy.soyu.station.dto.response;

import com.ssafy.soyu.station.domain.Station;
import lombok.Data;

@Data
public class ListResponseDto {
  private Long stationId;
  private String name;
  private String address;
  private Float latitude;
  private Float altitude;
  private boolean is_favorite;

  public ListResponseDto(Station s, boolean is_favorite) {
    this.stationId = s.getId();
    this.name = s.getName();
    this.address = s.getAddress();
    this.latitude = s.getLatitude();
    this.altitude = s.getLongitude();
    this.is_favorite = is_favorite;
  }
}
