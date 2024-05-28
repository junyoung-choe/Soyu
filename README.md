# 소유

## 1. 소유 소개

- **프로젝트 진행 기간 : 24.01.08(월) ~ 24.02.16(금)**
- **도메인 : 웹 IoT**
- **주제 : 비대면 중고거래 플랫폼 <소유>**
- **프로젝트 인원 : 6인 (엄진식, 손주현, 최준영, 이재신, 이호진, 이성현)**

![member](https://github.com/jaesin463/X10/assets/117919180/bbd6aee6-667e-4c1d-834b-911f30d58e65)

## 2. 개요

### 물건을 확인하고 거래하고 싶은 당신을 위한 서비스<소유>

> 중고거래의 경우 보통 대면거래를 통해 물건을 직접 확인하고 살 수 있는 장점이 있지만, 정확한 시간과 장소에 대한 약속이 필요하며 범죄 노출과 같은 이유로 비대면 중고거래를 선호하는 사람이 늘고있습니다.

> 하지만 문고리 거래와 같은 비대면 방식 거래 또한 주소 노출의 우려가 있고 물건의 분실 우려가 있기 때문에, **중고거래에 특화된 비대면 중고거래 시스템**에 대해 기획하게 됐습니다.


## 3. 기술 스택

### Back-End / DB / Infra
- 스프링부트 / JPA / MySql / JWT / FCM
- Amazone EC2 / docker / Jenkins  / NGINX / Stomp

### Front-End
- React / Framer Motion / SockJS / Style-Component / React-Router-Dom

### IoT
- Arduino

![Frame 33366](https://github.com/jaesin463/X10/assets/117919180/7708a1f1-c298-49a3-8d0f-0344a9c9f432)

## 4. 기능 소개

### ① 로그인 및 회원가입

![stack](https://github.com/jaesin463/X10/assets/117919180/918020fe-5694-4b08-8d2d-3749b9521397){: width="50%" height="50%"}

- 유저 기능은 **네이버 소셜 회원가입**을 구현하였습니다.
- 회원 가입시 네이버에서 회원의 정보를 가져와 저장합니다.
- **JWT Refresh Token은 DB에 저장**합니다.

### ② 채팅

![Untitle2d](https://github.com/jaesin463/X10/assets/117919180/2f14033c-9de5-4eb6-a7fa-c2ecbfa5aa3c){: width="50%" height="50%"}

- 물품 상세 정보에서 **채팅방을 생성**하여 판매자와 채팅을 나눌 수 있습니다.
- **거래 약속하기 버튼**을 통해서 판매자와 비대면 거래를 할 수 있게 됩니다.

### ③ 거래 약속

![Untitle3d](https://github.com/jaesin463/X10/assets/117919180/04f78d12-8880-4cf2-ae33-2c3880529ee0)

- 거래 약속하기 버튼을 누른 후 보관하고 싶은 스테이션을 선택합니다.
- 스테이션 선택 후 **보관함을 선택하면 예약**이 완료됩니다.

### ④ 보관함 코드 확인

![Untitl4ed](https://github.com/jaesin463/X10/assets/117919180/0176f783-1dac-46d5-9f02-d8b23e6342be){: width="50%" height="50%"}

- 오프라인 판매코드 확인하기를 통해 보관함에 입력할 **판매코드**를 확인할 수 있습니다.
- 판매자가 키오스크에 판매코드를 입력하면 구매자는 이후에 **구매코드**를 구매내역에서 확인할 수 있습니다.

### ⑤ 키오스크 화면

![Untit5led](https://github.com/jaesin463/X10/assets/117919180/91b94e6f-85ef-4928-b399-77a1ee7c772b)

- **판매**
    - 판매자가 판매코드를 입력합니다.
    - 판매코드를 입력하면 예약한 보관함이 **20초**간 열리게 됩니다.
        
        ![Untitle6d](https://github.com/jaesin463/X10/assets/117919180/f3aceb88-d4b6-4858-896b-e415cffa208c)
        
    - 판매자는 물품을 보관함에 넣습니다.

- **구매**
    - 구매자가 구매코드를 입력합니다.
    - 보관함의 **유리창이 투명상태**가 되며 구매자는 물품의 상태를 눈으로 확인할 수 있습니다.
    
    ![Un7titled](https://github.com/jaesin463/X10/assets/117919180/8555dce7-9920-4523-82f0-ff42778011ea)
    
    - 구매 버튼을 누르면 소유 서비스의 회사 계좌가 나타나게 됩니다.
    
    ![Untit8led](https://github.com/jaesin463/X10/assets/117919180/607e2b45-fd38-4977-9d81-bad2d78ea494)

    
    - **반려 버튼**을 누르면 아이템의 **거래 예약이 파기**됩니다.
    

## 5. DB 설계
![Untitl10ed](https://github.com/jaesin463/X10/assets/117919180/e32f158e-9175-4fa6-bc19-0eccb5475967)

## 6. 디자인 시스템 구축
![Untitle9d](https://github.com/jaesin463/X10/assets/117919180/0061f1fd-a517-4080-8fa7-772a296a2df7)

## 7. 폴더 구조
- [Front-Dir](산출물/front_dir_tree)
- [Back-Dir](산출물/back_dir_tree)
