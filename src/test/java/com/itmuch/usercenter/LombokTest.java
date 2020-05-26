// package com.itmuch.usercenter;
//
// import lombok.*;
// import lombok.extern.slf4j.Slf4j;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
//
// @Slf4j
// public class LombokTest {
//
//     // public static final Logger LOGGER = LoggerFactory.getLogger(LombokTest.class);
//
//     public static void main(String[] args) {
//         UserRegisterDTO userRegisterDTO = new UserRegisterDTO();
//
//         UserRegisterDTO build = userRegisterDTO.builder()
//                 .email("x")
//                 .password("xx")
//                 .confirmPassword("xx")
//                 .agreement(true)
//                 .build();
//
//         log.info("构造出来的UserRegisterDTO = {}", build);
//     }
// }
//
// @Data
// @NoArgsConstructor
// @AllArgsConstructor
// // @RequiredArgsConstructor
// @Builder
// class UserRegisterDTO {
//
//     private String email;
//     private String password;
//     private String confirmPassword;
//     private String mobile;
//     private Boolean agreement;
//
// }
