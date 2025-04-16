class Solution {
    public String validIPAddress(String queryIP) {
        if (queryIP.contains(".")) {
            if (queryIP.startsWith(".") || queryIP.endsWith(".")) return "Neither";
            String[] newString = queryIP.split("\\.");
            if (newString.length != 4) return "Neither";
            for (int i = 0; i < newString.length; i++) {
                if (newString[i].isEmpty() || newString[i].length() > 3) return "Neither";
                if (newString[i].charAt(0) == '0' && newString[i].length() != 1) return "Neither";
                for (char c : newString[i].toCharArray()) {
                    if (!Character.isDigit(c)) return "Neither";
                }
                int val = 0;
                for (char c : newString[i].toCharArray()) {
                    val = val * 10 + (c - '0');
                }
                if (val > 255) return "Neither";
            }
            return "IPv4";
        }
        if (queryIP.contains(":")) {
            if (queryIP.startsWith(":") || queryIP.endsWith(":")) return "Neither";
            String[] newString = queryIP.split(":");
            if (newString.length != 8) return "Neither";

            for (int i = 0; i < newString.length; i++) {
                if (newString[i].isEmpty() || newString[i].length() > 4) return "Neither";

                for (char c : newString[i].toCharArray()) {
                    if (!Character.isDigit(c) && !(c >= 'a' && c <= 'f') && !(c >= 'A' && c <= 'F')) {
                        return "Neither";
                    }
                }
            }
            return "IPv6";
        }
        return "Neither";
    }
}
