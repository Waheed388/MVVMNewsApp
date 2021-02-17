# MVVMNewsApp


A fully functional MVVM News Application written in Kotlin. 

# Features 

* MVVM Architecture 
* Navigation Component
* Coroutines 
* Retrofit
* Room 
* RecycleView Pagination 
* Signal Activity Design 
* Glide 


**Why MVVM**
* ViewModel has Built in LifeCycleOwerness, on the other hand Presenter not, and you have to take this responsiblty in your side.
* ViewModel doesn't have a reference for View, on the other hand Presenter still hold a reference for view, even if you made it as weakreference.
* ViewModel survive configuration changes, while it is your own responsiblities to survive the configuration changes in case of Presenter. (Saving and restoring the UI state)
**MVVM Best Pratice:**

* Avoid references to Views in ViewModels.
* Instead of pushing data to the UI, let the UI observe changes to it.
* Distribute responsibilities, add a domain layer if needed.
* Add a data repository as the single-point entry to your data.
* Expose information about the state of your data using a wrapper or another LiveData.
* Consider edge cases, leaks and how long-running operations can affect the instances in your architecture.
* Don’t put logic in the ViewModel that is critical to saving clean state or related to data. Any call you make from a ViewModel can be the last one.

# What is Coroutines ?

**Coroutines**  : Is light wight threads for asynchronous programming, Coroutines not only open the doors to asynchronous programming, but also provide a wealth of other possibilities such as concurrency, actors, etc.

**What is the Coroutines benefits?**

* Writing an asynchronous code is sequential manner.
* Costing of create coroutines are much cheaper to crate threads.
* Don't be over engineered to use observable pattern, when no need to use it.
* Parent coroutine can automatically manage the life cycle of its child coroutines for you.

# Keep your code clean according to MVVM

* Yes , liveData is easy , powerful , but you should know how to use.
* For livedate which will emit data stream , it has to be in your data layer , and don't inform those observables any thing else like in which thread those will consume , cause it is another
* For livedata which will emit UI binding events, it has to be in your ViewModel Layer.
* Observers in UI Consume and react to live data values and bind it. responsibility , and according to Single responsibility principle in SOLID (object-oriented design) , so don't break this concept by mixing the responsibilities.

![alt text](https://developer.android.com/topic/libraries/architecture/images/final-architecture.png)



