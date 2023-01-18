package by.vasilenka.randomAndSort.rest;

import by.vasilenka.randomAndSort.services.impl.RandomListOfIntegersGeneratorService;
import by.vasilenka.randomAndSort.services.impl.SortedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sort")
public class SortedController {
    /*
     *  GET request for URL localhost:8080/sort?size=16&bound=155&sorting_type=ASC
     *
     * @param size - size of future list
     * @param bound - bound for each number in list
     * @param sortingType type of sorting (ASC & DESC)
     *
     * return src list of generated integers and sorted list of those integers
     * */
    @Autowired
    private RandomListOfIntegersGeneratorService<Integer> randomListOfIntegersGeneratorService;

    @Autowired
    private SortedService sortedService;

    @GetMapping
    public List<List<Integer>> generateAndSort(@RequestParam(name = "size")Integer size,
                                               @RequestParam(name = "bound") Integer bound,
                                               @RequestParam(name = "sorting_type") String sortingType){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> integerList = randomListOfIntegersGeneratorService.generate(size, bound);
        result.add(new ArrayList<>(integerList));
        sortedService.sort(integerList, sortingType);
        result.add(integerList);
        return result;
    }

}
