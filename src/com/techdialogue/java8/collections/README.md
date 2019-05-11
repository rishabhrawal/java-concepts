# Changes Done


**Iterable** 
<br/>// iterates internally and, takes a consumer
<br/>boolean forEach(Consumer<? Super E> consumer)

**Collection**
<br/>// takes Predicate to filter elements
<br/>boolean removeIf(Predicate<? super E> filter)

**List**
<br/> takes a Function to modify elements, replaced by a new object specified by function
<br/> boolean replaceAll(UnaryOperator<? super E> operator)
<br/>
<br/> sorts the list and takes a comparator
<br/> boolean sort(Comparator<? super E> comparator);

<br/>********************************************************
<br/> **Map**
<br/>public void forEach(BiConsumer<? super K, ? super V> consumer);  //Iterates over map, and supplies key, values to the Biconsumer
<br/>V getOrDefault(Object key, V defaultValue); //return a default value other than null if key is not presetn, differentiate whether key is not present or if value stored is null
<br/>V putIfAbsent(K key, V value); //adds only if key is not present, does not overwrite
<br/>V replace(K key, V newValue); //replace only if key is present
<br/>boolean replace(Key k, V existingValue, V newValue); //replace only if old value is same as the one we passes
<br/>void replaceAll(BiFunction<? super K, ? super V, ? extends V> function); //replace existing value with a new computed one
<br/>void remove(K key, V value); //remove if both key and value match

**Compute Methods**
<br/>V compute(K key, Bifunction<? super K, ? super V, ? extends V> remapping);
<br/>V computeIfAbsent(K key, Function<? super K, ? extends V> mapping);
<br/>computeIfPresent(K key, BiFunction<K super K, ? super V, ? extends V> remapping);


**Merge**
V merge(K key, V newValue, BiFunction<? super K, ? super V, ? extends V> remapping);