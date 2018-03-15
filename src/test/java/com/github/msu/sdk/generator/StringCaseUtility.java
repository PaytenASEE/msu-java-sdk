package com.github.msu.sdk.generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCaseUtility {
    private List<String> dictionary;
    private final String [] allWords = {"merchant", "user", "date", "action", "password", "customer",
            "session", "type", "return", "url", "payment", "id", "amount", "currency", "email",
            "name", "phone", "agent", "expiry", "language", "campaign", "code", "query", "input",
            "items", "extra", "order", "bill", "address", "line", "city", "postal", "country",
            "token", "holder", "save", "card", "is", "refundable", "installments", "commission", "included",
            "points", "campaigns", "initiate", "business", "cvv", "threat", "metrix", "dealer", "sub",
            "status", "limit", "offset", "start", "end", "pan", "result", "apply", "rate", "dto", "from",
            "bin", "api", "gate", "default", "group", "notification", "channels", "recurring", "count", "pay",
            "by", "link", "displayed", "content", "split", "codes", "fax", "reason", "locked", "role",
            "confirm", "delete", "field", "integration", "refund", "invoice", "due", "recover", "rule",
            "output", "this", "on", "state", "recurrence", "plan", "page", "interim", "tmx", "code", "edit",
            "to", "void", "pre","post", "auth", "system", "old", "new", "issue", "transaction", "pg",
            "tran", "initiator", "ship", "recovery", "feature", "reset", "lower", "upper", "permission",
            "description", "pst", "max", "min", "re", "time", "zone", "parent", "tckn", "vkn", "contact", "disable",
            "online", "offline", "message", "error", "text", " compay", "response", "request", "eft", "bkm", "policy",
            "gate", "3d", "key", "interest", "valid", "for", "debit", "e", "wallet"};
    //Pls add missing words!

    //QueryTransactionStats e gabon included dhe include!
    public String toCamelCase(String input) {
        dictionary = new ArrayList<>(Arrays.asList(allWords));
        input = input.toLowerCase();
        String result = "";
        int j = 0;
        for (int i = 1; i <= input.length(); i++) {
            String substring = input.substring(j, i);
            if (dictionary.contains(substring)) {
                for(int e = i+1; e <= input.length(); e++){
                    String temp = input.substring(j, e);
                    if(e < input.length()+1 && dictionary.contains(temp)){
                        i = e;
                        substring = input.substring(j, e);
                    }
                }
                j = i;
                result += result.isEmpty() ? substring : firstUpperCase(substring);
            }
        }
        return input.length() == result.length() ? result : halfCamel(result, input);
    }

    public String firstUpperCase(String s1) {
        String firstLetter = (s1.charAt(0) + "").toUpperCase();
        return firstLetter + s1.substring(1, s1.length());
    }

    private String halfCamel(String result, String input){
        if(result.length() == 0) return input;
        String temp = input.substring(result.length());
        return result + (input.length() - result.length() <= 1 ? temp : firstUpperCase(temp));
    }

    public static void main(String[] args) {
        String test = new StringCaseUtility().toCamelCase("ISSUEDATE");
        System.out.println(test);
    }
}
