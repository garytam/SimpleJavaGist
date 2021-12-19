package com.gtc.optional;

import java.util.Locale;
import java.util.Optional;

public class OptionalPoc {

    private Optional<String> changeCase(String str){
        if (str != null && str.startsWith("a")){
            return Optional.of(str.toUpperCase(Locale.ROOT)) ;
        } else {
            return Optional.ofNullable(str);
        }
    }
    public static void main(String[] args) {
        OptionalPoc poc = new OptionalPoc();

        System.out.println(poc.changeCase("aGardo").get());
        poc.changeCase("ding dong").ifPresent( val -> System.out.println(val));
        System.out.println(poc.changeCase(null).isPresent());
    }
}
