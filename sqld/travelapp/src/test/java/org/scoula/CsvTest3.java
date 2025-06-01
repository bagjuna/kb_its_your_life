package org.scoula;

import lombok.Builder;
import org.scoula.travel.domain.TravelDao;
import org.scoula.travel.domain.TravelVO;

public class CsvTest3 {
    public static void main(String[] args) {
        TravelVO.builder()
                .no(1L)
                .district("서울")
                .title("서울여행")
                .description("서울 여행을 떠나보세요.")
                .address("서울특별시")
                .phone("02-1234-5678")
                .build();

    }
}
