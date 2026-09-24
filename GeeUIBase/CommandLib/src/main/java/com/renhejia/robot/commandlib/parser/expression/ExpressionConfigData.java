package com.renhejia.robot.commandlib.parser.expression;

import java.util.Arrays;

/**
 * @author liujunbin
 */
public class ExpressionConfigData {

    private ExpressionText[] expression_content_list;

    public ExpressionText[] getExpression_content_list() {
        return expression_content_list;
    }

    public void setExpression_content_list(ExpressionText[] expression_content_list) {
        this.expression_content_list = expression_content_list;
    }

    @Override
    public String toString() {
        return "{" +
                "expression_content_list:" + Arrays.toString(expression_content_list) +
                '}';
    }
}
