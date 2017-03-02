/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.rocketmq.console.service.impl;

import org.apache.rocketmq.console.testbase.RocketMQConsoleTestBase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext
public class MessageServiceImplTest extends RocketMQConsoleTestBase {
    @Before
    public void setUp() throws Exception {
        startTestMQConsumer();
    }

    @After
    public void tearDown() throws Exception {
        destroyMQClientEnv();
    }
    @Test
    public void viewMessage() throws Exception {

    }

    @Test
    public void queryMessageByTopicAndKey() throws Exception {

    }

    @Test
    public void queryMessageByTopic() throws Exception {

    }

    @Test
    public void messageTrackDetail() throws Exception {

    }

    @Test
    public void consumeMessageDirectly() throws Exception {

    }

    @Test
    public void viewMessageByBrokerAndOffset() throws Exception {

    }

}