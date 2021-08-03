function array_diff (list1, list2) {
    

    let listItems = []; let array_diff = [];

    for (let i = 0; i < list1.length; i++) {
        listItems[list1[i]] = true;
    }

    for (let i = 0; i < list2.length; i++) {
        if (listItems[list2[i]]) {
            delete listItems[list2[i]];
        } else {
            listItems[list2[i]] = true;
        }
    }

    for (let all in listItems) {
        array_diff.push(all);
    }
    return array_diff;
}
console.log(array_diff(['noah', 'paul', 'charlie'], ['paul', 'chisom', 'noah']))