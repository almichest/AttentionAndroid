package hira.attentionandroid.database

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * Created by hira on 2016/09/12.
 */

open class AttentionItem: RealmObject() {

    @PrimaryKey
    var identifier: String = ""
    var latitude: Double = 0.0
    var longitude: Double = 0.0
    var attentionBody: String = ""
    var placeName: String = ""
    var shared: Boolean = false

    fun equals(other: AttentionItem) = (this.identifier == other.identifier)
}

