package br.com.server.northwind.config;

import com.hazelcast.config.MapConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.hazelcast.config.*;
//
//@Configuration
//public class CacheConfig {
//
//   @Bean
//   public Config cacheConfig () {
//      return new Config().setInstanceName( "haszel-instance" )
//            .addMapConfig( new MapConfig(  ).setName( "northwind-cache" )
//                  .setTimeToLiveSeconds( 3000 ).setMetadataPolicy( MetadataPolicy.CREATE_ON_UPDATE ));
//   }
//}
