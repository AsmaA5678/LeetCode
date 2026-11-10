class Solution {
    public String defangIPaddr(String address) {
        String sep="[.]";
        address=address.replace(".",sep);
        return address;
    }
}