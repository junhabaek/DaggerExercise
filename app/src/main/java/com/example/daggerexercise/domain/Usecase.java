package com.example.daggerexercise.domain;

public abstract class Usecase<RequestFormat, ResponseFormat> {
    public void execute(RequestFormat requestParam, ISuccessCallback<ResponseFormat> successCallback,
                        IErrorCallback errorCallback){
        successCallback.onResponse(buildUsecase(requestParam));
    }

    protected abstract ResponseFormat buildUsecase(RequestFormat requestFormat);

    public interface ISuccessCallback<ResponseFormat>{
        void onResponse(ResponseFormat response);
    }

    public interface IErrorCallback{
        void onError(Throwable e);
    }
}
