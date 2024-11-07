# Common Utils

## Overview

Common Utils is a Java library that provides a collection of utility classes and methods for various common tasks, including data structures, algorithms, and string manipulation.

## Features

- **Data Structures**: Implementations of common data structures such as Stack and Trie.
- **Algorithms**: Search algorithms like Linear Search and Jump Search.
- **String Utilities**: Methods for string manipulation and analysis.
- **Testing Utilities**: Helper methods for generating test data.

## Installation

To use this library in your project, add the following dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>dev.aronba</groupId>
    <artifactId>commonutils</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Usage

### Data Structures

#### Stack

```java
import dev.aronba.commonutils.datastructures.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push("element");
        System.out.println(stack.pop());
    }
}
```

#### Trie

```java
import dev.aronba.commonutils.datastructures.graph.tree.Trie;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("hello");
        System.out.println(trie.search("he"));
    }
}
```

### Algorithms

#### Linear Search

```java
import dev.aronba.commonutils.algorithm.search.LinearSearch;

public class Main {
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        Integer[] array = {1, 2, 3, 4, 5};
        int result = linearSearch.search(array, 3);
        System.out.println(result);
    }
}
```

### String Utilities

```java
import dev.aronba.commonutils.string.StringUtils;

public class Main {
    public static void main(String[] args) {
        String reversed = StringUtils.reverse("Hello");
        System.out.println(reversed);
    }
}
```

### Testing Utilities

```java
import dev.aronba.commonutils.testing.TestingUtils;

public class Main {
    public static void main(String[] args) {
        List<Float> someList = TestingUtils.generateList(Float.class, 10);
        System.out.println(someList);
    }
}
```

## Running Tests

To run the tests, use the following command:

```sh
mvn test
```

## License

This project is licensed under the MIT License.
