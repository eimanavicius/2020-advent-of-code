package com.telesoftas.adventofcode.operationorder;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OperationOrderTest {

    @ParameterizedTest
    @CsvSource({
        "1 + 2 * 3 + 4 * 5 + 6,71",
        "1 + (2 * 3) + (4 * (5 + 6)),51",
        "2 * 3 + (4 * 5),26",
        "5 + (8 * 3 + 9 + 3 * 4 * 3),437",
        "5 * 9 * (7 * 3 * 3 + 9 * 3 + (8 + 6 * 4)),12240",
        "((2 + 4 * 9) * (6 + 9 * 8 + 6) + 6) + 2 + 4 * 2,13632"
    })
    void part1_evaluate_samples(String expression, long expected) {
        assertEquals(expected, OperationOrder.evaluateExpression(expression));
    }

    @ParameterizedTest
    @CsvSource({
        "1 + 2 * 3 + 4 * 5 + 6,231",
        "1 + (2 * 3) + (4 * (5 + 6)),51",
        "2 * 3 + (4 * 5),46",
        "5 + (8 * 3 + 9 + 3 * 4 * 3),1445",
        "5 * 9 * (7 * 3 * 3 + 9 * 3 + (8 + 6 * 4)),669060",
        "((2 + 4 * 9) * (6 + 9 * 8 + 6) + 6) + 2 + 4 * 2,23340"
    })
    void part2_evaluate_samples(String expression, long expected) {
        assertEquals(expected, OperationOrder.evaluateExpressionWithAdditionPrecedence(expression));
    }
}
