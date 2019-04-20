# MVP
MVP is separated into 3 layers 
1- Model -> Carrying the logic of the application , The function gets invoked from the presenter layer and the result is returned to it
2- View -> Taking actions from user and deliver the action to the presenter
3-Presenter -> acts as the middle layer between view and model so they can't communicate directly but they must communicate through the presenter 

The interface is added so that i can reuse the function in many classes on a larger scale project
