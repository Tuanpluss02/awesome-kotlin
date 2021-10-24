/*
 * This file is generated by jOOQ.
 */
package link.kotlin.server.jooq.main


import kotlin.collections.List

import org.jooq.Schema
import org.jooq.impl.CatalogImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class DefaultCatalog : CatalogImpl("") {
    companion object {

        /**
         * The reference instance of <code>DEFAULT_CATALOG</code>
         */
        public val DEFAULT_CATALOG: DefaultCatalog = DefaultCatalog()
    }

    /**
     * The schema <code>public</code>.
     */
    val PUBLIC: Public get(): Public = Public.PUBLIC

    override fun getSchemas(): List<Schema> = listOf(
        Public.PUBLIC
    )
}