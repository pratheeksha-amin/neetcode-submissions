class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String>hash=new HashSet<>();
        for(String e:emails)
        {
            String[] parts=e.split("@");
            String local=parts[0];
            String domain=parts[1];
            local=local.replaceAll("\\.","");
            local=local.replaceAll("\\+.+","");
            hash.add(local+"@"+domain);

        }
        return hash.size();
    }
}