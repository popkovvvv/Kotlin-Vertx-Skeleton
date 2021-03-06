package org.jasoet.kotlin.module

import dagger.Component
import org.jasoet.kotlin.verticle.MainVerticle
import org.mongodb.morphia.Datastore
import javax.inject.Singleton

/**
 * [Documentation Here]
 *
 * @author Deny Prasetyo
 */
@Singleton
@Component(modules = arrayOf(VertxModule::class, MongoModule::class))
interface TestAppComponent {
    fun dataStore(): Datastore
    fun mainVerticle(): MainVerticle
}