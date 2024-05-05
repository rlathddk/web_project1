package team4.model.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder // 생성자 단점을 보완한 라이브러리 함수 제공

public class EduDto {

    // ================== 강의실 배정 ===================//
    private int rno;
    private int roomnumber;
    private int totalperson;

    // ================================================//

    //강의시간==============================
    private String dayweek; //강의날짜
    private String starttime;  //강의 시작시간
    private String endtime;    //강의 끝시간
    //====================================

    public EduDto(int rno, int roomnumber, int totalperson) {
        this.rno = rno;
        this.roomnumber = roomnumber;
        this.totalperson = totalperson;
    }



// ================================================ //
}


