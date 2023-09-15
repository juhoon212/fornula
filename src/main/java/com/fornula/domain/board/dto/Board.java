package com.fornula.domain.board.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
create table board (board_idx number primary key, board_title varchar2(100) not null,
board_content varchar(3000) not null , id varchar(50) not null, boardfile_name varchar2(100),
board_status number not null, view_cnt number , 
reg_date date, comment_cnt number, up_date date);

create sequence board_seq;

commit;
*/

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Board {
    private int boardIdx;
    private String boardTitle;
    private String boardContent;
    private String id;
    private String boardFileName;
    private int boardStatus;
    private int viewCnt;
    private String regDate;
    private int commentCnt;
    private String upDate;
    
}
