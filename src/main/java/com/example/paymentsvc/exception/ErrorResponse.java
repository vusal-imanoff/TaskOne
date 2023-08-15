package com.example.paymentsvc.exception;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
public class ErrorResponse {

    private final String message;
}
