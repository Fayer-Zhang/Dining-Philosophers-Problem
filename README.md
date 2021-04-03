# SEG2106 Lab 7
## Exercise 2 - Using Semaphores
2.2 The deadlock can avoid in this case, because we only allow four philosophers to eat at a time. That means if each philosopher holds one chopstick at the same time, there is still one chopstick left on the table, so at least one philosopher can eat first and then release his chopsticks, then other philosophers can use it. 

## Exercise 3 - Using Limited Wait
2.3 The deadlock can avoid in this case, because philosophers have limited time when they hold or wait for the chopstick. When the limited time passes, the philosopher must release a chopstick, so it will never happen a philosopher hold the chopstick for a long time. 

## Exercise 4 – Using odd or even
2.4 The deadlock can be avoided. Same as Philosopher 3 and 4, Philosopher 1 and 2 share the same chopstick and they will not take another chopstick until they take the shared chopstick. Therefore, at least 2 philosophers did not hold any chopstick at the same time. Thus, deadlock cannot happened.

