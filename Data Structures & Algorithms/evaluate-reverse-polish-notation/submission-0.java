class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String ch:tokens)
        {
            if(!ch.equals("+") && !ch.equals("-") &&
                !ch.equals("*") && !ch.equals("/"))
            {
                stack.push(Integer.parseInt(ch));
            }
            else if(ch.equals("+")||ch.equals("-")||ch.equals("*")||ch.equals("/"))
            {
                int result=0;
                int ch1=stack.pop();
                int ch2=stack.pop();
                switch(ch)
                {
                    case "+":result=ch2+ch1;
                        break;
                    case "-":result=ch2-ch1;
                        break;
                    case "*":result=ch2*ch1;
                        break;
                    case "/":result=ch2/ch1;
                        break;

                }
                stack.push(result);
            }
        }
        return stack.peek();
        
    }
}
