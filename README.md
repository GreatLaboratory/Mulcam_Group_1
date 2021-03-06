# Mulcam_Group_1
---
# 발표자 소개 
## 1조  
### 조장 권해민
---
# 프로젝트 개요 및 개발 동기  
  
## 2-1 . 개발 동기  
>  
> 영어 타자 능력은 개발자의 덕목 중 하나  
  
>> 필수 능력은 아니지만 동일한 시간 내에 더 많은 생산성을 보장함  
>>  
>> 12.26일 OT에서 언급되었듯이 최소 분당 200타는 칠 수 있으면 좋음  
>>  
  
> 이에 영어 타자 연습을 프로그램 개발에 연계시키고 즐겁게 연습할 수 있는 환경 고려  
> 
>  
> 게임환경을 통한 영어 타자를 익숙하게 만들며 프로그램에서 쓰이는 단어 습득하는 것으로 결정  
>  
## 2-2 프로젝트 개요  
  
> 1. Java기반 SW 개발에 적합한 형태를 고려 
> 
>  
> 2. 과정 간 교육받은 Oracle과 MyBatis를 활용 고려
>
>  
> 3. SW의 결과 DB의 연계성 고려
>  
>  
> ==> 이에 게임 SW를 구현 및 결과를 DB에 저장하는 형태로 구현.
---
# 프로젝트 목적
> 1. Java 개발을 진행하여 *SW 개발경험 체득*
>  
> 2. *DB를 구축하는 개발을 진행하여 지식 체득*
>  
> 3. *SW와 DB의 연동에 대한 개념을 연계한 실전능력 체득*
>  
> 4. 협업도구 Github을 사용한 *협업관리 체계 지식 습득*
>  
> 5. 프로젝트간 필요한 *협업능력 습득*  
---
# 프로젝트 기대 효과  
  
> 게임을 통한 영어 타자 능력 향상 및 코딩 능력 증진효과 기대  
  
---
# 프로젝트 스케줄
> 01.24 : 프로젝트 아이템 선정 및 청사진 설정  
>  
> 01.25 : 기본 GUI 및 내부 작동 형태 구현  
>  
> 01.28 : GUI 형태 구성 및 내부 작동 구현  
>  
> 01.29 : DB구성 및 SW와 연동 작업  
>  
> 01.30 : 내부 오류 및 필요기능 재정비 및 DB 연동  
>  
> 01.31 : 프로젝트 마무리 점검 및 최종발표
---
# 참여 인원과 업무
## 조장    
>권해민 - *내부 SW 구현*  
>  
## 조원    
>김명관 - *MVC구성의 패키지 및 클래스 설계, DB구축 및 연동, GUI구현*  
>  
>김범찬 - *GUI 및 SW구현, 쓰레드 오류 디버깅* 
>  
>양주호 - *쓰레드 구현, 버그 수정, DB 및 GUI 내부 설계, 진두지휘*   
---
# 개발 환경 정보
> 1. Java JDK 8.0 기반 개발 환경과 Eclipse IDE 환경
>  
> 2. Oracle 11 및 MyBatis 3.5의 DB 환경
>  
> 3. Github 협업 환경
>  
> 4. Window 기반 개발환경
---
# DB 설계와 SW 클래스 구성
## Oracle 11 기반 DB 2개로 구성  
> gamer.sql : 사용자 ID와 게임 플레이 후 결과 데이터 저장
>  
> word.sql : 게임에 사용될 단어 데이터 저장  

## Java MVC기반의 패키지구성과 SW구현
![class](https://user-images.githubusercontent.com/42127568/52027202-d94e2f00-254d-11e9-9a1a-5ea4578852c7.png)
>  
> view의 생성자를 호출하여 화면구현, 버튼-액션리스너를 통해 게임실행, 게임결과 DB저장, DB데이터 가져오기 기능을 가진 Control package 구성  
>  
> GamerDAO와 WordsDAO에 sql문을 실행하는 메소드구현, GamerVO에 정보저장하는 Model package구성 
>  
> main, input, ranking, play 기능이 있는 GUI를 구현한 View package구성
>  
> mybatis를 사용한 sql문이 저장되어있는 mapper package구성  
>  
> 게임에 쓰일 단어를 저장, 불러오는 기능과 게이머의 정보를 입력받고 불러오는 기능이 있는 sql파일 2개 구성 (gamer.sql, words.sql)
>  
> 연동에 필요한 명령어가 담겨있는 mybatis package 
---
# 세부적인 기능 설명 
## Main View 
![default](https://user-images.githubusercontent.com/42127568/52026043-e5d08880-2549-11e9-9fd1-67d77cef92fc.PNG)  

> RankView 버튼을 누르면 Rank창으로 전환
>  
> Drop 창을 누르면 게임화면으로 전환  

## Game Play View  
![1](https://user-images.githubusercontent.com/42127568/52026224-6f805600-254a-11e9-8874-b63dfb3ab871.PNG)  
  
> Text 입력창에 Enter 입력 시 실행  
>  
> 한 화면에 최대 4개의 글자가 하단 프레임까지 떨어짐  
>  
> 총 3회의 LIfe  
>  
> 이 글자가 하단 프레임에 닿으면 Life 감소  
>  
> 게임 종료 시 Rank ID를 입력하면 생존 시간을 gamer DB에 저장  
>  
> 단어는 words.sql에서 무작위로 호출  
>  
> 난이도는 시간이 지날 수록 떨어지는 속도를 조절하여 구현  
  
  
## Rank View
![rank2](https://user-images.githubusercontent.com/42127568/52026229-71e2b000-254a-11e9-866f-06b683729570.png)  
  
> 상위 4명의 ID와 전적을 제공  
>  
> 이는 gamer.sql에 저장된 값에서 호출
---
# 데이터 유효성 설정
    
![word_db](https://user-images.githubusercontent.com/42127568/52022754-ad2ab200-253d-11e9-968e-262bda57e7a8.PNG)  
>  
> 단어 DB 상에서 단어의 중복을 막기 위해 각 단어에 고유한 번호를 Primary Key를 통해 부여  
>  
> 각 단어의 DB 입력 간 Null 값을 제한한기 위하여 Not Null을 부여하여 유효성 확보  
>  
![gamer_db](https://user-images.githubusercontent.com/42127568/52022755-adc34880-253d-11e9-9e36-22e789104646.PNG)  
>  
> 플레이어의 이름에 대해서 고유값 지정을 위해 Columm에 Primary Key 지정  
>  
> 플레이어의 전적에 대해 Null값을 방지하기 위해 Not Null을 
---
# 시연
> 



---
# 보완 사항 및 아쉬웠던 점  
  
> 본래 긴글 쓰기를 통한 분당 타수 측정 및 정확도 측정도 고려했으나 시간에 따른 프로젝트 축소  
>   
> 더 많은 단어를 플레이 화면에 더 떨어뜨리려 했으나 구현 제한  
>  
> 이후 추가적인 업데이트를 통한 GUI 개선 및 내부 알고리즘 안정화 필요  
>  
> 추후 부가적인 기능의 추가 가능
---
# Q & A
