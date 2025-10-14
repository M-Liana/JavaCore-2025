package homework1.homework6;

public class BraceChecker {
    private String text;

    BraceChecker(String text) {
        this.text = text;

    }

    public void check(String text) {
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);

                    int pop = stack.pop();

                    if (pop != ')') {
                        System.out.println("Error ․opened " + c + "but not closed  )" + " at " + i);
                    }

            }



        }


    }


}

