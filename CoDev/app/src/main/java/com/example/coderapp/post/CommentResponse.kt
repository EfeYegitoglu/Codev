package com.example.coderapp.post

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CommentResponse(
    @SerializedName("comments")
    @Expose
    var comments: List<Comment>?,
    @SerializedName("success")
    @Expose
    var success: Int?,
    @SerializedName("message")
    @Expose
    var message: String?

) : Serializable {
}