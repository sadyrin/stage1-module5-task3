package com.epam.mjc;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        List<Integer> out = list.stream()
            .filter(l -> l % 2 == 0 )
            .collect(Collectors.toList());

        return out;
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        List<String> out = list.stream()
            .map(l -> l.toUpperCase())
            .collect(Collectors.toList());

        return out;
    }

    public Optional<Integer> findMax(List<Integer> list) {
        Optional<Integer> out = list.stream()
            .max(Comparator.naturalOrder());

        return out;
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        Optional<Integer> out = list.stream()
            .flatMap(List::stream)
            .min(Comparator.naturalOrder());

        return out;
    }

    public Integer sum(List<Integer> list) {
        Integer out = list.stream()
            .reduce(0, (subtotal, element) -> subtotal + element);

        return out;
    }
}
