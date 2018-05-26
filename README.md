# Dozzer 

 Dozer is a Java Bean to Java Bean mapper that recursively copies data from one object to another. It is also called as mapping framework which is responsible for mapping data from one Java Bean object to another,these Java Beans will be of different complex types (simple to most complex).

Usually we use below utilities
```sh
    1) org.springframework.beans.BeanUtils.copyProperties(java.lang.Object source, java.lang.Object target);
    2) org.apache.commons.beanutils.BeanUtils.copyProperties(Object dest, Object source);
```
  to copy from source to destination objects. This methods are useful when Source and Destination fields are same. what if fieldNames are different, then we will fall into write setters manually from source to destination.

 - which some times leads to bugs, as we may set one property to other or we have forgot to copy few fields.
 - To solve this problem, Dozzer has powerfull mechanism which will resolve this, by just placing @Mapping(“source/destination fieldName”) annotation on the field or getter method level by specifing the attribute name which is differed in source and destination objects.
 - Ultimately it will reduces development time & assures bug free code if you follow the rules as mentioned.

# Installation
 Just a step :- Include latest dependency in pom.xml
```sh
    <dependencies>
        <dependency>
            <groupId>net.sf.dozer</groupId>
            <artifactId>dozer</artifactId>
            <version>5.5.1</version>
        </dependency>
    </dependencies>
```

Thats it you are pretty much done to start coding, code is self explanatory, where ever required placed comments to understand.

  
License
---- 
**An Open Source initiative, Rohith9s!** 
