# 《Effective Java》 第二版 学习实践记录代码

### 第五章

- 要优先使用基本类型而不是装箱基本类型， 要当心无意识的自动装箱

第 8 条

equals 方法实现了等价关系（ equivalence relation） ：

- 自反性（ reflexive） 。 对于任何非 null 的引用值 x ， x.equals(x) 必须返回 true 。
  对称性（ symmetric） 。 对于任何非 null 的引用值 x 和 y ， 当且仅当 y.equals(x) 返回 true 时， x.equals(y) 必须返回 true 。
- 传递性（ transitive） 。 对于任何非 null 的引用值 x 、 y 和 z 。 如果 x.equals(y) 返
  回 true ， 并且 y.equals(z) 也返回 true ， 那么 x.equals(z) 也必须返回 true 。
- 一致性（ consistent） 。 对于任何非 null 的引用值 x 和 y ， 只要 equals 的比较操作
  在对象中所用的信息没有被修改， 多次调用 x.equals(x) 就会一致地返回 true ， 或者一
  致的返回 false 。
- 对于任何非 null 的引用值 x ， x.equals(null) 必须返回 false 。