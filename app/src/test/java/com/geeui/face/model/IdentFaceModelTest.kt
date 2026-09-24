package com.geeui.face.model

import com.google.gson.Gson
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

class IdentFaceModelTest {

    @Test
    fun parsesOwnerFaceFromIdentJson() {
        val model = Gson().fromJson(
            """{"areaPercent":12.5,"faceNumber":2,"isOwner":true}""",
            IdentFaceModel::class.java
        )

        assertEquals(12.5, model.areaPercent!!, 0.001)
        assertEquals(2, model.faceNumber)
        assertEquals(true, model.isOwner)
    }

    @Test
    fun missingFieldsStayNull() {
        val model = Gson().fromJson("{}", IdentFaceModel::class.java)

        assertNull(model.areaPercent)
        assertNull(model.faceNumber)
        assertNull(model.isOwner)
    }
}
