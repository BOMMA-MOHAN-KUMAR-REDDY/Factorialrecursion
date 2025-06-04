class Solution {
     public static String removeSubPair(String str){
        Stack<Character> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(ch != ')'){
                stk.push(ch);
            } else {
                List<Character> list = new ArrayList<>();
                while(!stk.isEmpty() && stk.peek() != '('){
                    list.add(stk.pop());
                }
                stk.pop();
                
                for(char c : list){
                    stk.push(c);
                }
            }
        }
        while(!stk.isEmpty()){
            sb.insert(0,stk.pop());
        }
        return sb.toString();
    }
    public String reverseParentheses(String s) {
        return removeSubPair(s);
    }
}